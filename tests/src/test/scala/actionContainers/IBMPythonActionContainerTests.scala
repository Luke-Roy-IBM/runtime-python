/*
 * Copyright 2023 IBM Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package runtime.actionContainers

import java.io.File
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import spray.json.DefaultJsonProtocol._
import spray.json._
import common.WskActorSystem
import actionContainers.{ActionContainer, BasicActionRunnerTests}
import actionContainers.ActionContainer.withContainer
import actionContainers.ResourceHelpers.{readAsBase64, ZipBuilder}
import java.nio.file.Paths

@RunWith(classOf[JUnitRunner])
class IBMPythonActionContainerTests extends BasicActionRunnerTests with WskActorSystem {

  lazy val imageName = "action-python-v3.6"

  /** indicates if strings in python are unicode by default (i.e., python3 -> true, python2.7 -> false) */
  lazy val pythonStringAsUnicode = true

  /** indicates if errors are logged or returned in the answer */
  lazy val initErrorsAreLogged = true

  override def withActionContainer(env: Map[String, String] = Map.empty)(code: ActionContainer => Unit) = {
    withContainer(imageName, env)(code)
  }

  behavior of imageName

  override val testNoSourceOrExec = TestConfig("")
  override val testNoSource = TestConfig("", hasCodeStub = true)

  override val testNotReturningJson =
    TestConfig("""
                 |def main(args):
                 |    return "not a json object"
               """.stripMargin)

  override val testInitCannotBeCalledMoreThanOnce =
    TestConfig("""
                 |def main(args):
                 |    return args
               """.stripMargin)

  override val testEntryPointOtherThanMain =
    TestConfig(
      """
        |def niam(args):
        |  return args
      """.stripMargin,
      main = "niam")

  override val testEcho =
    TestConfig("""
      |from __future__ import print_function
      |import sys
      |def main(args):
      |    print('hello stdout')
      |    print('hello stderr', file=sys.stderr)
      |    return args
    """.stripMargin)

  override val testUnicode =
    TestConfig(if (pythonStringAsUnicode) {
      """
        |def main(args):
        |    sep = args['delimiter']
        |    str = sep + " ☃ " + sep
        |    print(str)
        |    return {"winter" : str }
      """.stripMargin.trim
    } else {
      """
        |def main(args):
        |    sep = args['delimiter']
        |    str = sep + " ☃ ".decode('utf-8') + sep
        |    print(str.encode('utf-8'))
        |    return {"winter" : str }
      """.stripMargin.trim
    })

  override val testEnv =
    TestConfig("""
      |import os
      |def main(dict):
      |    return {
      |       "api_host": os.environ['__OW_API_HOST'],
      |       "api_key": os.environ['__OW_API_KEY'],
      |       "namespace": os.environ['__OW_NAMESPACE'],
      |       "action_name": os.environ['__OW_ACTION_NAME'],
      |       "action_version": os.environ['__OW_ACTION_VERSION'],
      |       "activation_id": os.environ['__OW_ACTIVATION_ID'],
      |       "deadline": os.environ['__OW_DEADLINE']
      |    }
    """.stripMargin.trim)

  override val testLargeInput =
    TestConfig("""
        |def main(args):
        |    return args
      """.stripMargin)

  it should "support actions using non-default entry points" in {
    withActionContainer() { c =>
      val code = """
                   |def niam(dict):
                   |  return { "result": "it works" }
                   |""".stripMargin

      val (initCode, initRes) = c.init(initPayload(code, main = "niam"))
      initCode should be(200)

      val (_, runRes) = c.run(runPayload(JsObject()))
      runRes.get.fields.get("result") shouldBe Some(JsString("it works"))
    }
  }

  it should "support zip-encoded action using non-default entry points" in {
    val srcs = Seq(
      Seq("__main__.py") -> """
                |from echo import echo
                |def niam(args):
                |    return echo(args)
            """.stripMargin,
      Seq("echo.py") -> """
                |def echo(args):
                |  return { "echo": args }
            """.stripMargin)

    val code = ZipBuilder.mkBase64Zip(srcs)

    val (out, err) = withActionContainer() { c =>
      val (initCode, initRes) = c.init(initPayload(code, main = "niam"))
      initCode should be(200)

      val args = JsObject("msg" -> JsString("it works"))
      val (runCode, runRes) = c.run(runPayload(args))

      runCode should be(200)
      runRes.get.fields.get("echo") shouldBe Some(args)
    }

    checkStreams(out, err, {
      case (o, e) =>
        o shouldBe empty
        e shouldBe empty
    })
  }

  it should "support zip-encoded action which can read from relative paths" in {
    val srcs = Seq(
      Seq("__main__.py") -> """
                |def main(args):
                |    with open('workfile', 'r') as f:
                |      return { 'file': f.read() }
            """.stripMargin,
      Seq("workfile") -> "this is a test string")

    val code = ZipBuilder.mkBase64Zip(srcs)

    val (out, err) = withActionContainer() { c =>
      val (initCode, initRes) = c.init(initPayload(code))
      initCode should be(200)

      val args = JsObject()
      val (runCode, runRes) = c.run(runPayload(args))

      runCode should be(200)
      runRes.get.fields.get("file") shouldBe Some("this is a test string".toJson)
    }

    checkStreams(out, err, {
      case (o, e) =>
        o shouldBe empty
        e shouldBe empty
    })
  }

  it should "report error if zip-encoded action does not include required file" in {
    val srcs = Seq(Seq("echo.py") -> """
                |def echo(args):
                |  return { "echo": args }
            """.stripMargin)

    val code = ZipBuilder.mkBase64Zip(srcs)

    val (out, err) = withActionContainer() { c =>
      val (initCode, initRes) = c.init(initPayload(code, main = "echo"))
      initCode should be(502)
    }

    if (initErrorsAreLogged)
      checkStreams(out, err, {
        case (o, e) =>
          o shouldBe empty
          e should include("Zip file does not include")
      })
  }

  //
  // return the full path/filename of a file from the classpath
  //
  def testArtifact(name: String): String = {
    new File(this.getClass.getClassLoader.getResource(name).toURI).toString()
  }

  it should "report error if zipped Python action has wrong main module name" in {
    val zippedPythonActionWrongName = testArtifact("python_virtualenv_name.zip")

    val code = readAsBase64(Paths.get(zippedPythonActionWrongName))

    val (out, err) = withActionContainer() { c =>
      val (initCode, initRes) = c.init(initPayload(code, main = "main"))
      initCode should be(502)
    }

    if (initErrorsAreLogged)
      checkStreams(out, err, {
        case (o, e) =>
          o shouldBe empty
          e should include("Zip file does not include __main__.py")
      })
  }

  it should "report error if zipped Python action has invalid virtualenv directory" in {
    val zippedPythonActionWrongDir = testArtifact("python_virtualenv_dir.zip")

    val code = readAsBase64(Paths.get(zippedPythonActionWrongDir))
    val (out, err) = withActionContainer() { c =>
      val (initCode, initRes) = c.init(initPayload(code, main = "main"))
      initCode should be(502)
    }

    if (initErrorsAreLogged)
      checkStreams(out, err, {
        case (o, e) =>
          o shouldBe empty
          e should include("Zip file does not include /virtualenv/bin/")
      })
  }

  it should "return on action error when action fails" in {
    val (out, err) = withActionContainer() { c =>
      val code = """
                |def div(x, y):
                |    return x/y
                |
                |def main(dict):
                |    return {"divBy0": div(5,0)}
            """.stripMargin

      val (initCode, _) = c.init(initPayload(code))
      initCode should be(200)

      val (runCode, runRes) = c.run(runPayload(JsObject()))
      /* ActionLoop does not set 502 if there are application errors
       * Since it only receive a string from the application
       * it should parse the entire string  in JSON just to find it is an "error"
       */
      if (initErrorsAreLogged)
        runCode should be(502)

      runRes shouldBe defined
      runRes.get.fields.get("error") shouldBe defined
    }

    checkStreams(out, err, {
      case (o, e) =>
        o shouldBe empty
        e should include("Traceback")
    })
  }

  it should "log compilation errors" in {
    val (out, err) = withActionContainer() { c =>
      val code = """
              | 10 PRINT "Hello!"
              | 20 GOTO 10
            """.stripMargin

      val (initCode, res) = c.init(initPayload(code))
      // init checks whether compilation was successful, so return 502
      initCode should be(502)
    }

    if (initErrorsAreLogged)
      checkStreams(out, err, {
        case (o, e) =>
          o shouldBe empty
          e should include("Traceback")
      })
  }

  it should "support application errors" in {
    val (out, err) = withActionContainer() { c =>
      val code = """
                |def main(args):
                |    return { "error": "sorry" }
            """.stripMargin

      val (initCode, _) = c.init(initPayload(code))
      initCode should be(200)

      val (runCode, runRes) = c.run(runPayload(JsObject()))
      runCode should be(200) // action writer returning an error is OK

      runRes shouldBe defined
      runRes should be(Some(JsObject("error" -> JsString("sorry"))))
    }

    checkStreams(out, err, {
      case (o, e) =>
        o shouldBe empty
        e shouldBe empty
    })
  }

  it should "error when importing a not-supported package" in {
    val (out, err) = withActionContainer() { c =>
      val code = """
                |import iamnotsupported
                |def main(args):
                |    return { "error": "not reaching here" }
            """.stripMargin

      if (initErrorsAreLogged) {
        val (initCode, res) = c.init(initPayload(code))
        initCode should be(200)

        val (runCode, runRes) = c.run(runPayload(JsObject()))
        runCode should be(502)
      } else {
        // action loop detects those errors at init time
        val (initCode, initRes) = c.init(initPayload(code))
        initCode should be(502)
        initRes.get.fields.get("error").get.toString() should include("Cannot start action. Check logs for details.")
      }
    }

    if (initErrorsAreLogged)
      checkStreams(out, err, {
        case (o, e) =>
          o shouldBe empty
          e should include("Traceback")
      })
  }
}
