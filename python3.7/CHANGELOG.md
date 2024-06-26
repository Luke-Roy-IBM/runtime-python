# IBM Functions Python 3.7 Runtime Container

## 1.23.0
Changes:
  - Update to new parent image to get latest security fixes and to update to action proxy version 1.18@1.17.1.
  - Python version as of deployment time >=3.7.15
  
## 1.22.5
Changes:
  - Update to new parent image to get latest security fixes

## 1.22.4
Changes:
  - Update to new parent image to get latest go security fixes for the action loop proxy (/bin/proxy).

Python version:
  - [3.7.11](https://github.com/docker-library/python/blob/0c29e9cf700253291c7f2327537cb1d65f14a428/3.7/buster/Dockerfile)

Python packages:
  - The file [requirements.txt](requirements.txt) lists the packages we guarantee to be included in this runtime.<br/>
    Ensure that you only use packages mentioned there.<br/>
    Other python packages might be part of this runtime, but only due to indirect dependencies of the above listed packages. These indirectly included packages are candidates to be removed at any time in case they are not requ>

## 1.22.3
Changes:
  - Update GO_PROXY_RELEASE_VERSION to 1.15@1.18.0.
  - Update to new parent image to get latest go security fixes.

Python version:
  - [3.7.11](https://github.com/docker-library/python/blob/0c29e9cf700253291c7f2327537cb1d65f14a428/3.7/buster/Dockerfile)

Python packages:
  - The file [requirements.txt](requirements.txt) lists the packages we guarantee to be included in this runtime.<br/>
    Ensure that you only use packages mentioned there.<br/>
    Other python packages might be part of this runtime, but only due to indirect dependencies of the above listed packages. These indirectly included packages are candidates to be removed at any time in case they are not requ>

## 1.22.2
Changes:
  - Use renamed openwhisk/action-python-v3.7 (was openwhisk/actionloop-python-v3.7) parent image.

Python version:
  - [3.7.11](https://github.com/docker-library/python/blob/0c29e9cf700253291c7f2327537cb1d65f14a428/3.7/buster/Dockerfile)

Python packages:
  - The file [requirements.txt](requirements.txt) lists the packages we guarantee to be included in this runtime.<br/>
    Ensure that you only use packages mentioned there.<br/>
    Other python packages might be part of this runtime, but only due to indirect dependencies of the above listed packages. These indirectly included packages are candidates to be removed at any time in case they are not required by the referring package anymore.

## 1.22.1
Python version:
  - [3.7.10](https://github.com/docker-library/python/blob/8167dd2574bb503a131d262c0c5721c6ba02c928/3.7/buster/Dockerfile)

## 1.22.0
Changes:
  - update ibmcloudsql from `0.4.9` to `0.4.11`

Python version:
  - [3.7.9](https://github.com/docker-library/python/blob/7392a0441706ffe66862c37e6d8ceb4d5b1c4389/3.7/buster/Dockerfile)

Python packages:
  - The file [requirements.txt](requirements.txt) lists the packages we guarantee to be included in this runtime.<br/>
    Ensure that you only use packages mentioned there.<br/>
    Other python packages might be part of this runtime, but only due to indirect dependencies of the above listed packages. These indirectly included packages are candidates to be removed at any time in case they are not required by the referring package anymore.

## 1.21.0
Changes:
  - Update to new parent image to continue getting security fixes.
    The new parent is now based on go 1.15 (was go 1.12 before) and debian buster (was debian stretch before).

Python version:
  - [3.7.9](https://github.com/docker-library/python/blob/35d8d9712c3ea4cbc4004a0e62ab61100b6fed99/3.7/buster/Dockerfile)

Python packages:
  - The file [requirements.txt](requirements.txt) lists the packages we guarantee to be included in this runtime.<br/>
    Ensure that you only use packages mentioned there.<br/>
    Other python packages might be part of this runtime, but only due to indirect dependencies of the above listed packages. These indirectly included packages are candidates to be removed at any time in case they are not required by the referring package anymore.


## 1.20.0
Changes:
  - update ibmcloudsql from `0.4.2` to `0.4.9`

Python version:
  - [3.7.5](https://github.com/docker-library/python/blob/ab8b829cfefdb460ebc17e570332f0479039e918/3.7/stretch/Dockerfile)

Python packages:
  - The file [requirements.txt](requirements.txt) lists the packages we guarantee to be included in this runtime.<br/>
    Ensure that you only use packages mentioned there.<br/>
    Other python packages might be part of this runtime, but only due to indirect dependencies of the above listed packages. These indirectly included packages are candidates to be removed at any time in case they are not required by the referring package anymore.


## 1.19.0
Changes:
  - update httplib2 from `0.13.0` to `0.18.1`
  - update ibmcloudsql from `0.3.16` to `0.4.2`

Python version:
  - [3.7.5](https://github.com/docker-library/python/blob/ab8b829cfefdb460ebc17e570332f0479039e918/3.7/stretch/Dockerfile)

Python packages:
  - The file [requirements.txt](requirements.txt) lists the packages we guarantee to be included in this runtime.<br/>
    Ensure that you only use packages mentioned there.<br/>
    Other python packages might be part of this runtime, but only due to indirect dependencies of the above listed packages. These indirectly included packages are candidates to be removed at any time in case they are not required by the referring package anymore.


## 1.18.0
Changes:
  - update ibmcloudsql from `0.3.14` to `0.3.16`

Python version:
  - [3.7.5](https://github.com/docker-library/python/blob/ab8b829cfefdb460ebc17e570332f0479039e918/3.7/stretch/Dockerfile)

Python packages:
  - The file [requirements.txt](requirements.txt) lists the packages we guarantee to be included in this runtime.<br/>
    Ensure that you only use packages mentioned there.<br/>
    Other python packages might be part of this runtime, but only due to indirect dependencies of the above listed packages. These indirectly included packages are candidates to be removed at any time in case they are not required by the referring package anymore.


## 1.17.0
Changes:
  - update ibmcloudsql from `0.3.13` to `0.3.14`

Python version:
  - [3.7.5](https://github.com/docker-library/python/blob/ab8b829cfefdb460ebc17e570332f0479039e918/3.7/stretch/Dockerfile)

Python packages:
  - The file [requirements.txt](requirements.txt) lists the packages we guarantee to be included in this runtime.<br/>
    Ensure that you only use packages mentioned there.<br/>
    Other python packages might be part of this runtime, but only due to indirect dependencies of the above listed packages. These indirectly included packages are candidates to be removed at any time in case they are not required by the referring package anymore.


## 1.16.0
Changes:
  - update ibmcloudsql from `0.2.23` to `0.3.13`

Python version:
  - [3.7.5](https://github.com/docker-library/python/blob/ab8b829cfefdb460ebc17e570332f0479039e918/3.7/stretch/Dockerfile)

Python packages:
  - attrs==19.3.0
  - Automat==0.8.0
  - beautifulsoup4==4.8.0
  - botocore==1.15.5
  - cassandra-driver==3.18.0
  - certifi==2019.11.28
  - cffi==1.13.2
  - chardet==3.0.4
  - Click==7.0
  - cloudant==2.12.0
  - constantly==15.1.0
  - cryptography==2.8
  - cssselect==1.1.0
  - docutils==0.15.2
  - elasticsearch==6.3.1
  - etcd3==0.10.0
  - Flask==1.0.2
  - gevent==1.4.0
  - greenlet==0.4.15
  - grpcio==1.27.2
  - httplib2==0.13.0
  - hyperlink==19.0.0
  - ibm-cos-sdk==2.5.1
  - ibm-cos-sdk-core==2.6.0
  - ibm-cos-sdk-s3transfer==2.6.0
  - ibm-db==3.0.1
  - ibmcloudsql==0.3.13
  - idna==2.7
  - incremental==17.5.0
  - itsdangerous==1.1.0
  - Jinja2==2.11.1
  - jmespath==0.9.4
  - kafka-python==1.4.6
  - lxml==4.3.4
  - MarkupSafe==1.1.1
  - numpy==1.16.4
  - pandas==0.24.2
  - parsel==1.5.2
  - pika==1.0.1
  - Pillow==6.2.2
  - pip==20.0.2
  - protobuf==3.11.3
  - psycopg2==2.8.2
  - pyarrow==0.16.0
  - pyasn1==0.4.8
  - pyasn1-modules==0.2.7
  - pycparser==2.19
  - PyDispatcher==2.0.5
  - PyHamcrest==1.9.0
  - PyJWT==1.7.1
  - pymongo==3.8.0
  - pyOpenSSL==19.1.0
  - python-dateutil==2.8.0
  - pytz==2019.3
  - queuelib==1.5.0
  - redis==3.2.1
  - requests==2.22.0
  - scikit-learn==0.20.3
  - scipy==1.2.1
  - Scrapy==1.6.0
  - service-identity==18.1.0
  - setuptools==45.2.0
  - simplejson==3.16.0
  - six==1.14.0
  - soupsieve==2.0
  - tenacity==6.0.0
  - tornado==4.5.2
  - Twisted==20.3.0
  - urllib3==1.23
  - virtualenv==16.7.1
  - w3lib==1.21.0
  - watson-developer-cloud==2.8.1
  - websocket-client==0.48.0
  - Werkzeug==1.0.0
  - wheel==0.33.6
  - zope.interface==4.7.1

## 1.15.0
Changes:
  - update Twisted from `19.7.0` to `20.3.0` (security fixes)
  - update Pillow from `6.2.1` to `6.2.2` (security fixes)

Python version:
  - [3.7.5](https://github.com/docker-library/python/blob/ab8b829cfefdb460ebc17e570332f0479039e918/3.7/stretch/Dockerfile)

Python packages:
  - attrs==19.3.0
  - Automat==0.8.0
  - beautifulsoup4==4.8.0
  - botocore==1.15.5
  - cassandra-driver==3.18.0
  - certifi==2019.11.28
  - cffi==1.13.2
  - chardet==3.0.4
  - Click==7.0
  - cloudant==2.12.0
  - constantly==15.1.0
  - cryptography==2.8
  - cssselect==1.1.0
  - docutils==0.15.2
  - elasticsearch==6.3.1
  - etcd3==0.10.0
  - Flask==1.0.2
  - gevent==1.4.0
  - greenlet==0.4.15
  - grpcio==1.27.2
  - httplib2==0.13.0
  - hyperlink==19.0.0
  - ibm-cos-sdk==2.5.1
  - ibm-cos-sdk-core==2.6.0
  - ibm-cos-sdk-s3transfer==2.6.0
  - ibm-db==3.0.1
  - ibmcloudsql==0.2.23
  - idna==2.7
  - incremental==17.5.0
  - itsdangerous==1.1.0
  - Jinja2==2.11.1
  - jmespath==0.9.4
  - kafka-python==1.4.6
  - lxml==4.3.4
  - MarkupSafe==1.1.1
  - numpy==1.16.4
  - pandas==0.24.2
  - parsel==1.5.2
  - pika==1.0.1
  - Pillow==6.2.2
  - pip==20.0.2
  - protobuf==3.11.3
  - psycopg2==2.8.2
  - pyarrow==0.16.0
  - pyasn1==0.4.8
  - pyasn1-modules==0.2.7
  - pycparser==2.19
  - PyDispatcher==2.0.5
  - PyHamcrest==1.9.0
  - PyJWT==1.7.1
  - pymongo==3.8.0
  - pyOpenSSL==19.1.0
  - python-dateutil==2.8.0
  - pytz==2019.3
  - queuelib==1.5.0
  - redis==3.2.1
  - requests==2.22.0
  - scikit-learn==0.20.3
  - scipy==1.2.1
  - Scrapy==1.6.0
  - service-identity==18.1.0
  - setuptools==45.2.0
  - simplejson==3.16.0
  - six==1.14.0
  - soupsieve==2.0
  - tenacity==6.0.0
  - tornado==4.5.2
  - Twisted==20.3.0
  - urllib3==1.23
  - virtualenv==16.7.1
  - w3lib==1.21.0
  - watson-developer-cloud==2.8.1
  - websocket-client==0.48.0
  - Werkzeug==1.0.0
  - wheel==0.33.6
  - zope.interface==4.7.1

## 1.14.1
Changes:
  - Catch latest security fixes with each build.

## 1.14.0
Changes:
  - update to new base image
  - update pip from `19.3.1` to `20.0.2`

Python version:
  - [3.7.5](https://github.com/docker-library/python/blob/ab8b829cfefdb460ebc17e570332f0479039e918/3.7/stretch/Dockerfile)

Python packages:
  - attrs==19.3.0
  - Automat==0.8.0
  - beautifulsoup4==4.8.0
  - botocore==1.15.5
  - cassandra-driver==3.18.0
  - certifi==2019.11.28
  - cffi==1.13.2
  - chardet==3.0.4
  - Click==7.0
  - cloudant==2.12.0
  - constantly==15.1.0
  - cryptography==2.8
  - cssselect==1.1.0
  - docutils==0.15.2
  - elasticsearch==6.3.1
  - etcd3==0.10.0
  - Flask==1.0.2
  - gevent==1.4.0
  - greenlet==0.4.15
  - grpcio==1.27.2
  - httplib2==0.13.0
  - hyperlink==19.0.0
  - ibm-cos-sdk==2.5.1
  - ibm-cos-sdk-core==2.6.0
  - ibm-cos-sdk-s3transfer==2.6.0
  - ibm-db==3.0.1
  - ibmcloudsql==0.2.23
  - idna==2.7
  - incremental==17.5.0
  - itsdangerous==1.1.0
  - Jinja2==2.11.1
  - jmespath==0.9.4
  - kafka-python==1.4.6
  - lxml==4.3.4
  - MarkupSafe==1.1.1
  - numpy==1.16.4
  - pandas==0.24.2
  - parsel==1.5.2
  - pika==1.0.1
  - Pillow==6.2.1
  - pip==20.0.2
  - protobuf==3.11.3
  - psycopg2==2.8.2
  - pyarrow==0.16.0
  - pyasn1==0.4.8
  - pyasn1-modules==0.2.7
  - pycparser==2.19
  - PyDispatcher==2.0.5
  - PyHamcrest==1.9.0
  - PyJWT==1.7.1
  - pymongo==3.8.0
  - pyOpenSSL==19.1.0
  - python-dateutil==2.8.0
  - pytz==2019.3
  - queuelib==1.5.0
  - redis==3.2.1
  - requests==2.22.0
  - scikit-learn==0.20.3
  - scipy==1.2.1
  - Scrapy==1.6.0
  - service-identity==18.1.0
  - setuptools==45.2.0
  - simplejson==3.16.0
  - six==1.14.0
  - soupsieve==2.0
  - tenacity==6.0.0
  - tornado==4.5.2
  - Twisted==19.7.0
  - urllib3==1.23
  - virtualenv==16.7.1
  - w3lib==1.21.0
  - watson-developer-cloud==2.8.1
  - websocket-client==0.48.0
  - Werkzeug==1.0.0
  - wheel==0.33.6
  - zope.interface==4.7.1

## 1.13.0
Changes:
  - update to new base image
  - update pip from `19.2.3` to `19.3.1`
  - update pillow from `6.0.0` to `6.2.1`

Python version:
  - [3.7.5](https://github.com/docker-library/python/blob/ab8b829cfefdb460ebc17e570332f0479039e918/3.7/stretch/Dockerfile)

Python packages:
  - attrs==19.3.0
  - Automat==0.8.0
  - beautifulsoup4==4.8.0
  - botocore==1.13.8
  - cassandra-driver==3.18.0
  - certifi==2019.9.11
  - cffi==1.13.1
  - chardet==3.0.4
  - Click==7.0
  - cloudant==2.12.0
  - constantly==15.1.0
  - cryptography==2.8
  - cssselect==1.1.0
  - docutils==0.15.2
  - elasticsearch==6.3.1
  - etcd3==0.10.0
  - Flask==1.0.2
  - gevent==1.4.0
  - greenlet==0.4.15
  - grpcio==1.24.3
  - httplib2==0.13.0
  - hyperlink==19.0.0
  - ibm-cos-sdk==2.5.1
  - ibm-cos-sdk-core==2.5.5
  - ibm-cos-sdk-s3transfer==2.5.5
  - ibm-db==3.0.1
  - ibmcloudsql==0.2.23
  - idna==2.7
  - incremental==17.5.0
  - itsdangerous==1.1.0
  - Jinja2==2.10.3
  - jmespath==0.9.4
  - kafka-python==1.4.6
  - lxml==4.3.4
  - MarkupSafe==1.1.1
  - numpy==1.16.4
  - pandas==0.24.2
  - parsel==1.5.2
  - pika==1.0.1
  - Pillow==6.2.1
  - pip==19.3.1
  - protobuf==3.10.0
  - psycopg2==2.8.2
  - pyarrow==0.15.1
  - pyasn1==0.4.7
  - pyasn1-modules==0.2.7
  - pycparser==2.19
  - PyDispatcher==2.0.5
  - PyHamcrest==1.9.0
  - PyJWT==1.7.1
  - pymongo==3.8.0
  - pyOpenSSL==19.0.0
  - python-dateutil==2.8.0
  - pytz==2019.3
  - queuelib==1.5.0
  - redis==3.2.1
  - requests==2.22.0
  - scikit-learn==0.20.3
  - scipy==1.2.1
  - Scrapy==1.6.0
  - service-identity==18.1.0
  - setuptools==41.6.0
  - simplejson==3.16.0
  - six==1.12.0
  - soupsieve==1.9.5
  - tenacity==5.1.5
  - tornado==4.5.2
  - Twisted==19.7.0
  - urllib3==1.23
  - virtualenv==16.7.1
  - w3lib==1.21.0
  - watson-developer-cloud==2.8.1
  - websocket-client==0.48.0
  - Werkzeug==0.16.0
  - wheel==0.33.6
  - zope.interface==4.6.0

## 1.12.0
Changes:
  - add PyJWT `1.7.1`
  - update pip from `19.2.1` to `19.2.3`

Python version:
  - [3.7.4](https://github.com/docker-library/python/blob/ab8b829cfefdb460ebc17e570332f0479039e918/3.7/stretch/Dockerfile)

Python packages:
  - asn1crypto==0.24.0
  - attrs==19.1.0
  - Automat==0.7.0
  - beautifulsoup4==4.8.0
  - botocore==1.12.234
  - cassandra-driver==3.18.0
  - certifi==2019.6.16
  - cffi==1.12.3
  - chardet==3.0.4
  - Click==7.0
  - cloudant==2.12.0
  - constantly==15.1.0
  - cryptography==2.7
  - cssselect==1.0.3
  - docutils==0.15.2
  - elasticsearch==6.3.1
  - etcd3==0.10.0
  - Flask==1.0.2
  - gevent==1.4.0
  - greenlet==0.4.15
  - grpcio==1.23.0
  - httplib2==0.13.0
  - hyperlink==19.0.0
  - ibm-cos-sdk==2.5.1
  - ibm-cos-sdk-core==2.5.3
  - ibm-cos-sdk-s3transfer==2.5.3
  - ibm-db==3.0.1
  - ibmcloudsql==0.2.23
  - idna==2.7
  - incremental==17.5.0
  - itsdangerous==1.1.0
  - Jinja2==2.10.1
  - jmespath==0.9.4
  - kafka-python==1.4.6
  - lxml==4.3.4
  - MarkupSafe==1.1.1
  - numpy==1.16.4
  - pandas==0.24.2
  - parsel==1.5.1
  - pika==1.0.1
  - Pillow==6.0.0
  - pip==19.2.3
  - protobuf==3.9.2
  - psycopg2==2.8.2
  - pyarrow==0.14.1
  - pyasn1==0.4.5
  - pyasn1-modules==0.2.5
  - pycparser==2.19
  - PyDispatcher==2.0.5
  - PyHamcrest==1.9.0
  - PyJWT==1.7.1
  - pymongo==3.8.0
  - pyOpenSSL==19.0.0
  - python-dateutil==2.8.0
  - pytz==2019.2
  - queuelib==1.5.0
  - redis==3.2.1
  - requests==2.22.0
  - scikit-learn==0.20.3
  - scipy==1.2.1
  - Scrapy==1.6.0
  - service-identity==18.1.0
  - setuptools==41.2.0
  - simplejson==3.16.0
  - six==1.12.0
  - soupsieve==1.9.3
  - tenacity==5.1.1
  - tornado==4.5.2
  - Twisted==19.7.0
  - urllib3==1.23
  - virtualenv==16.7.1
  - w3lib==1.20.0
  - watson-developer-cloud==2.8.1
  - websocket-client==0.48.0
  - Werkzeug==0.16.0
  - wheel==0.33.4
  - zope.interface==4.6.0

## 1.11.0
Changes:
  - update Twisted from `19.2.1` to `19.7.0`

Python version:
  - [3.7.4](https://github.com/docker-library/python/blob/ab8b829cfefdb460ebc17e570332f0479039e918/3.7/stretch/Dockerfile)

Python packages:
  - asn1crypto==0.24.0
  - attrs==19.1.0
  - Automat==0.7.0
  - beautifulsoup4==4.8.0
  - botocore==1.12.196
  - cassandra-driver==3.18.0
  - certifi==2019.6.16
  - cffi==1.12.3
  - chardet==3.0.4
  - Click==7.0
  - cloudant==2.12.0
  - constantly==15.1.0
  - cryptography==2.7
  - cssselect==1.0.3
  - docutils==0.15.1
  - elasticsearch==6.3.1
  - etcd3==0.10.0
  - Flask==1.0.2
  - gevent==1.4.0
  - greenlet==0.4.15
  - grpcio==1.22.0
  - httplib2==0.13.0
  - hyperlink==19.0.0
  - ibm-cos-sdk==2.5.1
  - ibm-cos-sdk-core==2.5.1
  - ibm-cos-sdk-s3transfer==2.5.1
  - ibm-db==3.0.1
  - ibmcloudsql==0.2.23
  - idna==2.7
  - incremental==17.5.0
  - itsdangerous==1.1.0
  - Jinja2==2.10.1
  - jmespath==0.9.4
  - kafka-python==1.4.6
  - lxml==4.3.4
  - MarkupSafe==1.1.1
  - numpy==1.16.4
  - pandas==0.24.2
  - parsel==1.5.1
  - pika==1.0.1
  - Pillow==6.0.0
  - pip==19.2.1
  - protobuf==3.9.0
  - psycopg2==2.8.2
  - pyarrow==0.14.1
  - pyasn1==0.4.5
  - pyasn1-modules==0.2.5
  - pycparser==2.19
  - PyDispatcher==2.0.5
  - PyHamcrest==1.9.0
  - pymongo==3.8.0
  - pyOpenSSL==19.0.0
  - python-dateutil==2.8.0
  - pytz==2019.1
  - queuelib==1.5.0
  - redis==3.2.1
  - requests==2.22.0
  - scikit-learn==0.20.3
  - scipy==1.2.1
  - Scrapy==1.6.0
  - service-identity==18.1.0
  - setuptools==41.0.1
  - simplejson==3.16.0
  - six==1.12.0
  - soupsieve==1.9.2
  - tenacity==5.0.4
  - tornado==4.5.2
  - Twisted==19.7.0
  - urllib3==1.23
  - virtualenv==16.7.1
  - w3lib==1.20.0
  - watson-developer-cloud==2.8.1
  - websocket-client==0.48.0
  - Werkzeug==0.15.5
  - wheel==0.33.4
  - zope.interface==4.6.0


## 1.10.0
Changes:
  - update to new base image
  - update pip from `19.0.2` to `19.2.1`
  - update beautifulsoup4 from `4.7.1` to `4.8.0`
  - update httplib2 from `0.12.3` to `0.13.0`
  - update lxml from `4.3.3` to `4.3.4`
  - update requests from `2.21.0` to `2.22.0`
  - update vurtualenv from `16.5.0` to `16.7.1`
  - update Twisted from `19.2.0` to `19.2.1`
  - update numpy from `1.16.3` to `1.16.4`
  - update ibm-cos-sdk from `2.4.4` to `2.5.1`
  - update cassandra-driver from `3.17.1` to `3.18.0`

Python version:
  - [3.7.4](https://github.com/docker-library/python/blob/ab8b829cfefdb460ebc17e570332f0479039e918/3.7/stretch/Dockerfile)

Python packages:
  - asn1crypto==0.24.0
  - attrs==19.1.0
  - Automat==0.7.0
  - beautifulsoup4==4.8.0
  - botocore==1.12.196
  - cassandra-driver==3.18.0
  - certifi==2019.6.16
  - cffi==1.12.3
  - chardet==3.0.4
  - Click==7.0
  - cloudant==2.12.0
  - constantly==15.1.0
  - cryptography==2.7
  - cssselect==1.0.3
  - docutils==0.15.1
  - elasticsearch==6.3.1
  - etcd3==0.10.0
  - Flask==1.0.2
  - gevent==1.4.0
  - greenlet==0.4.15
  - grpcio==1.22.0
  - httplib2==0.13.0
  - hyperlink==19.0.0
  - ibm-cos-sdk==2.5.1
  - ibm-cos-sdk-core==2.5.1
  - ibm-cos-sdk-s3transfer==2.5.1
  - ibm-db==3.0.1
  - ibmcloudsql==0.2.23
  - idna==2.7
  - incremental==17.5.0
  - itsdangerous==1.1.0
  - Jinja2==2.10.1
  - jmespath==0.9.4
  - kafka-python==1.4.6
  - lxml==4.3.4
  - MarkupSafe==1.1.1
  - numpy==1.16.4
  - pandas==0.24.2
  - parsel==1.5.1
  - pika==1.0.1
  - Pillow==6.0.0
  - pip==19.2.1
  - protobuf==3.9.0
  - psycopg2==2.8.2
  - pyarrow==0.14.1
  - pyasn1==0.4.5
  - pyasn1-modules==0.2.5
  - pycparser==2.19
  - PyDispatcher==2.0.5
  - PyHamcrest==1.9.0
  - pymongo==3.8.0
  - pyOpenSSL==19.0.0
  - python-dateutil==2.8.0
  - pytz==2019.1
  - queuelib==1.5.0
  - redis==3.2.1
  - requests==2.22.0
  - scikit-learn==0.20.3
  - scipy==1.2.1
  - Scrapy==1.6.0
  - service-identity==18.1.0
  - setuptools==41.0.1
  - simplejson==3.16.0
  - six==1.12.0
  - soupsieve==1.9.2
  - tenacity==5.0.4
  - tornado==4.5.2
  - Twisted==19.2.1
  - urllib3==1.23
  - virtualenv==16.7.1
  - w3lib==1.20.0
  - watson-developer-cloud==2.8.1
  - websocket-client==0.48.0
  - Werkzeug==0.15.5
  - wheel==0.33.4
  - zope.interface==4.6.0


## 1.9.0
Changes:
  - update to new base image
  - update pip from `19.0.2` to `19.1.1`
  - update httplib2 from `0.12.1` to `0.12.3`
  - update kafka_python from `1.4.4` to `1.4.6`
  - update lxml from `4.3.1` to `4.3.3`
  - update python-dateutil from `2.7.5` to `2.8.0`
  - update virtualenv from `16.3.0` to `16.5.0`
  - update Twisted from `18.9.0` to `19.2.0`
  - update numpy from `1.16.1` to `1.16.3`
  - update scikit-learn from `0.20.2` to `0.20.3`
  - update pandas from `0.24.1` to `0.24.2`
  - update Pillow from `5.4.1` to `6.0.0`
  - update ibm-db from `2.0.9` to `3.0.1`
  - update cloudant from `2.11.0` to `2.12.0`
  - update watson-developer-cloud from `2.8.0` to `2.8.1`
  - update ibm-cos-sdk from `2.4.3` to `2.4.4`
  - update psycopg2 from `2.7.7` to `2.8.2`
  - update pymongo from `3.7.2` to `3.8.0`
  - update redis from `3.1.0` to `3.2.1`
  - update pika from `0.13.0` to `1.0.1`
  - update cassandra-driver from `3.16.0` to `3.17.1`
  - update etcd3 from `0.8.1` to `0.10.0`

Python version:
  - [3.7.3](https://github.com/docker-library/python/blob/ab8b829cfefdb460ebc17e570332f0479039e918/3.7/stretch/Dockerfile)

Python packages:
  - asn1crypto==0.24.0
  - attrs==19.1.0
  - Automat==0.7.0
  - beautifulsoup4==4.7.1
  - botocore==1.12.144
  - cassandra-driver==3.17.1
  - certifi==2019.3.9
  - cffi==1.12.3
  - chardet==3.0.4
  - Click==7.0
  - cloudant==2.12.0
  - constantly==15.1.0
  - cryptography==2.6.1
  - cssselect==1.0.3
  - docutils==0.14
  - elasticsearch==6.3.1
  - etcd3==0.10.0
  - Flask==1.0.2
  - gevent==1.4.0
  - greenlet==0.4.15
  - grpcio==1.20.1
  - httplib2==0.12.3
  - hyperlink==19.0.0
  - ibm-cos-sdk==2.4.4
  - ibm-cos-sdk-core==2.4.4
  - ibm-cos-sdk-s3transfer==2.4.4
  - ibm-db==3.0.1
  - ibmcloudsql==0.2.23
  - idna==2.7
  - incremental==17.5.0
  - itsdangerous==1.1.0
  - Jinja2==2.10.1
  - jmespath==0.9.4
  - kafka-python==1.4.6
  - lxml==4.3.3
  - MarkupSafe==1.1.1
  - numpy==1.16.3
  - pandas==0.24.2
  - parsel==1.5.1
  - pika==1.0.1
  - Pillow==6.0.0
  - pip==19.1.1
  - protobuf==3.7.1
  - psycopg2==2.8.2
  - pyarrow==0.13.0
  - pyasn1==0.4.5
  - pyasn1-modules==0.2.5
  - pycparser==2.19
  - PyDispatcher==2.0.5
  - PyHamcrest==1.9.0
  - pymongo==3.8.0
  - pyOpenSSL==19.0.0
  - python-dateutil==2.8.0
  - pytz==2019.1
  - queuelib==1.5.0
  - redis==3.2.1
  - requests==2.21.0
  - scikit-learn==0.20.3
  - scipy==1.2.1
  - Scrapy==1.6.0
  - service-identity==18.1.0
  - setuptools==41.0.1
  - simplejson==3.16.0
  - six==1.12.0
  - soupsieve==1.9.1
  - tenacity==5.0.4
  - tornado==4.5.2
  - Twisted==19.2.0
  - urllib3==1.23
  - virtualenv==16.5.0
  - w3lib==1.20.0
  - watson-developer-cloud==2.8.1
  - websocket-client==0.48.0
  - Werkzeug==0.15.2
  - wheel==0.33.1
  - zope.interface==4.6.0


## 1.8.0
Changes:
  - update to new base image fixing issue [Python 3.7 - sys.executable is empty](https://github.com/apache/openwhisk-runtime-python/issues/49)
  - update httplib2 from `0.12.0` to `0.12.1`
  - update lxml from `4.3.0` to `4.3.1
  - update scipy from `1.2.0` to `1.2.1`
  - update watson-developer-cloud from `2.7.0` back to `2.8.0`

Python version:
  - [3.7.2](https://github.com/docker-library/python/blob/ab8b829cfefdb460ebc17e570332f0479039e918/3.7/stretch/Dockerfile)

Python packages:
  - asn1crypto==0.24.0
  - attrs==18.2.0
  - Automat==0.7.0
  - beautifulsoup4==4.7.1
  - botocore==1.12.98
  - cassandra  - driver==3.16.0
  - certifi==2018.11.29
  - cffi==1.12.1
  - chardet==3.0.4
  - Click==7.0
  - cloudant==2.11.0
  - constantly==15.1.0
  - cryptography==2.5
  - cssselect==1.0.3
  - docutils==0.14
  - elasticsearch==6.3.1
  - etcd3==0.8.1
  - Flask==1.0.2
  - gevent==1.4.0
  - greenlet==0.4.15
  - grpcio==1.18.0
  - httplib2==0.12.1
  - hyperlink==18.0.0
  - ibm-cos-sdk==2.4.3
  - ibm-cos-sdk-core==2.4.3
  - ibm-cos-sdk-s3transfer==2.4.3
  - ibm-db==2.0.9
  - ibmcloudsql==0.2.23
  - idna==2.7
  - incremental==17.5.0
  - itsdangerous==1.1.0
  - Jinja2==2.10
  - jmespath==0.9.3
  - kafka-python==1.4.4
  - lxml==4.3.1
  - MarkupSafe==1.1.0
  - numpy==1.16.1
  - pandas==0.24.1
  - parsel==1.5.1
  - pika==0.13.0
  - Pillow==5.4.1
  - pip==19.0.2
  - protobuf==3.6.1
  - psycopg2==2.7.7
  - pyarrow==0.12.0
  - pyasn1==0.4.5
  - pyasn1-modules==0.2.4
  - pycparser==2.19
  - PyDispatcher==2.0.5
  - PyHamcrest==1.9.0
  - pymongo==3.7.2
  - pyOpenSSL==19.0.0
  - python-dateutil==2.7.5
  - pytz==2018.9
  - queuelib==1.5.0
  - redis==3.1.0
  - requests==2.21.0
  - scikit-learn==0.20.2
  - scipy==1.2.1
  - Scrapy==1.6.0
  - service-identity==18.1.0
  - setuptools==40.8.0
  - simplejson==3.16.0
  - six==1.12.0
  - soupsieve==1.8
  - tenacity==5.0.3
  - tornado==4.5.2
  - Twisted==18.9.0
  - urllib3==1.23
  - virtualenv==16.3.0
  - w3lib==1.20.0
  - watson-developer-cloud==2.8.0
  - websocket-client==0.48.0
  - Werkzeug==0.14.1
  - wheel==0.33.0
  - zope.interface==4.6.0


## 1.7.0
Changes:
  - update cloudnt from `2.10.2` back to `2.11.0`
  - update ibm-cos-sdk from `2.4.2` back to `2.4.3`
  - update numpy from `1.16.0` back to `1.16.1`
  - update pandas from `0.23.4`back to `0.24.1`
  - update pika from `0.12.0` back to `0.13.0`
  - update psycopg2 from `2.7.6.1` back to `2.7.7`
  - update redis from `3.0.1` back to `3.1.0`
  - update Scrapy from `1.5.1` back to `1.6.0`
  - update virtualenv from `16.2.0` back to `16.3.0`
  - update watson-developer-cloud from `2.5.4` back to `2.7.0`

Python version:
- [3.7.2](https://github.com/docker-library/python/blob/ab8b829cfefdb460ebc17e570332f0479039e918/3.7/stretch/Dockerfile)

Python packages:
- asn1crypto==0.24.0
- attrs==18.2.0
- Automat==0.7.0
- beautifulsoup4==4.7.1
- botocore==1.12.87
- cassandra-driver==3.16.0
- certifi==2018.11.29
- cffi==1.11.5
- chardet==3.0.4
- Click==7.0
- cloudant==2.11.0
- constantly==15.1.0
- cryptography==2.5
- cssselect==1.0.3
- docutils==0.14
- elasticsearch==6.3.1
- etcd3==0.8.1
- Flask==1.0.2
- gevent==1.4.0
- greenlet==0.4.15
- grpcio==1.18.0
- httplib2==0.12.0
- hyperlink==18.0.0
- ibm-cos-sdk==2.4.3
- ibm-cos-sdk-core==2.4.3
- ibm-cos-sdk-s3transfer==2.4.3
- ibm-db==2.0.9
- ibmcloudsql==0.2.23
- idna==2.7
- incremental==17.5.0
- itsdangerous==1.1.0
- Jinja2==2.10
- jmespath==0.9.3
- kafka-python==1.4.4
- lxml==4.3.0
- MarkupSafe==1.1.0
- numpy==1.16.1
- pandas==0.24.1
- parsel==1.5.1
- pika==0.13.0
- Pillow==5.4.1
- pip==19.0.1
- protobuf==3.6.1
- psycopg2==2.7.7
- pyarrow==0.12.0
- pyasn1==0.4.5
- pyasn1-modules==0.2.4
- pycparser==2.19
- PyDispatcher==2.0.5
- PyHamcrest==1.9.0
- pymongo==3.7.2
- pyOpenSSL==19.0.0
- python-dateutil==2.7.5
- pytz==2018.9
- queuelib==1.5.0
- redis==3.1.0
- requests==2.21.0
- scikit-learn==0.20.2
- scipy==1.2.0
- Scrapy==1.6.0
- service-identity==18.1.0
- setuptools==40.7.3
- simplejson==3.16.0
- six==1.12.0
- soupsieve==1.7.3
- tenacity==5.0.3
- tornado==4.5.2
- Twisted==18.9.0
- urllib3==1.23
- virtualenv==16.3.0
- w3lib==1.20.0
- watson-developer-cloud==2.7.0
- websocket-client==0.48.0
- Werkzeug==0.14.1
- wheel==0.32.3
- zope.interface==4.6.0


## 1.6.0
Changes:
  - update gevent from `1.3.7` back to `1.4.0`
  - update beautifulsoup4 from `4.6.3` back to `4.7.1`
  - update httplib2 from `0.11.3` back to `0.12.0`
  - update lxml from `4.2.5` back to `4.3.0`
  - update numpy from `1.15.4` back to `1.16.0`
  - update virtualenv from `16.1.0` back to `16.2.0`
  - update scikit-learn from `0.20.1` back to `0.20.2`
  - update scipy from `1.1.0` back to `1.2.0`
  - update Pillow from `5.3.0` back to `5.4.1`
  - update cloudant from `2.10.1` back to `2.10.2`
  - update ibm-cos-sdk from `2.4.0` back to `2.4.2`
  - update watson-developer-cloud from `2.5.1` back to `2.5.4`

Python version:
- [3.7.2](https://github.com/docker-library/python/blob/ab8b829cfefdb460ebc17e570332f0479039e918/3.7/stretch/Dockerfile)

Python packages:
- asn1crypto==0.24.0
- attrs==18.2.0
- Automat==0.7.0
- beautifulsoup4==4.7.1
- botocore==1.12.80
- cassandra-driver==3.16.0
- certifi==2018.11.29
- cffi==1.11.5
- chardet==3.0.4
- Click==7.0
- cloudant==2.10.2
- constantly==15.1.0
- cryptography==2.4.2
- cssselect==1.0.3
- docutils==0.14
- elasticsearch==6.3.1
- etcd3==0.8.1
- Flask==1.0.2
- gevent==1.4.0
- greenlet==0.4.15
- grpcio==1.18.0
- httplib2==0.12.0
- hyperlink==18.0.0
- ibm-cos-sdk==2.4.2
- ibm-cos-sdk-core==2.4.2
- ibm-cos-sdk-s3transfer==2.4.2
- ibm-db==2.0.9
- ibmcloudsql==0.2.23
- idna==2.7
- incremental==17.5.0
- itsdangerous==1.1.0
- Jinja2==2.10
- jmespath==0.9.3
- kafka-python==1.4.4
- lxml==4.3.0
- MarkupSafe==1.1.0
- numpy==1.16.0
- pandas==0.23.4
- parsel==1.5.1
- pika==0.12.0
- Pillow==5.4.1
- protobuf==3.6.1
- psycopg2==2.7.6.1
- pyarrow==0.11.1
- pyasn1==0.4.5
- pyasn1-modules==0.2.3
- pycparser==2.19
- PyDispatcher==2.0.5
- PyHamcrest==1.9.0
- pymongo==3.7.2
- pyOpenSSL==18.0.0
- python-dateutil==2.7.5
- pytz==2018.9
- queuelib==1.5.0
- redis==3.0.1
- requests==2.21.0
- scikit-learn==0.20.2
- scipy==1.2.0
- Scrapy==1.5.1
- service-identity==18.1.0
- simplejson==3.16.0
- six==1.12.0
- soupsieve==1.7.1
- tenacity==5.0.2
- tornado==4.5.2
- Twisted==18.9.0
- urllib3==1.23
- virtualenv==16.2.0
- w3lib==1.20.0
- watson-developer-cloud==2.5.4
- websocket-client==0.48.0
- Werkzeug==0.14.1
- zope.interface==4.6.0


## 1.5.0
- update python from `3.7.1` to `3.7.2`
- switch openwhisk web proxy to high performance actionloop

Python version:
- [3.7.2](https://github.com/docker-library/python/blob/ab8b829cfefdb460ebc17e570332f0479039e918/3.7/stretch/Dockerfile)

Python packages:
- asn1crypto==0.24.0
- attrs==18.2.0
- Automat==0.7.0
- beautifulsoup4==4.6.3
- botocore==1.12.66
- cassandra-driver==3.16.0
- certifi==2018.11.29
- cffi==1.11.5
- chardet==3.0.4
- Click==7.0
- cloudant==2.10.1
- constantly==15.1.0
- cryptography==2.4.2
- cssselect==1.0.3
- docutils==0.14
- elasticsearch==6.3.1
- etcd3==0.8.1
- Flask==1.0.2
- gevent==1.3.7
- greenlet==0.4.15
- grpcio==1.17.1
- httplib2==0.11.3
- hyperlink==18.0.0
- ibm-cos-sdk==2.4.0
- ibm-db==2.0.9
- ibmcloudsql==0.2.23
- idna==2.8
- incremental==17.5.0
- itsdangerous==1.1.0
- Jinja2==2.10
- jmespath==0.9.3
- kafka-python==1.4.4
- lxml==4.2.5
- MarkupSafe==1.1.0
- numpy==1.15.4
- pandas==0.23.4
- parsel==1.5.1
- pika==0.12.0
- Pillow==5.3.0
- protobuf==3.6.1
- psycopg2==2.7.6.1
- pyarrow==0.11.1
- pyasn1==0.4.4
- pyasn1-modules==0.2.2
- pycparser==2.19
- PyDispatcher==2.0.5
- PyHamcrest==1.9.0
- pymongo==3.7.2
- pyOpenSSL==18.0.0
- python-dateutil==2.7.5
- pytz==2018.7
- queuelib==1.5.0
- redis==3.0.1
- requests==2.21.0
- scikit-learn==0.20.1
- scipy==1.1.0
- Scrapy==1.5.1
- service-identity==18.1.0
- simplejson==3.16.0
- six==1.12.0
- tenacity==5.0.2
- tornado==4.5.2
- Twisted==18.9.0
- urllib3==1.24.1
- virtualenv==16.1.0
- w3lib==1.19.0
- watson-developer-cloud==2.5.1
- websocket-client==0.48.0
- Werkzeug==0.14.1
- zope.interface==4.6.0

## 1.4.0
- add etcd3 `0.8.1`
- update ibm-cos-sdk from `2.3.3` back to `2.4.0`
- update requests from `2.20.1` back to `2.21.0`
- update watson-developer-cloud from `0.32.2` back to `0.32.3`

Python version:
- [3.7.1](https://github.com/docker-library/python/blob/39c500cc8aefcb67a76d518d789441ef85fc771f/3.7/stretch/slim/Dockerfile)

Python packages:
- asn1crypto==0.24.0
- attrs==18.2.0
- Automat==0.7.0
- beautifulsoup4==4.6.3
- botocore==1.12.66
- cassandra-driver==3.16.0
- certifi==2018.11.29
- cffi==1.11.5
- chardet==3.0.4
- Click==7.0
- cloudant==2.10.1
- constantly==15.1.0
- cryptography==2.4.2
- cssselect==1.0.3
- docutils==0.14
- elasticsearch==6.3.1
- etcd3==0.8.1
- Flask==1.0.2
- gevent==1.3.7
- greenlet==0.4.15
- grpcio==1.17.1
- httplib2==0.11.3
- hyperlink==18.0.0
- ibm-cos-sdk==2.4.0
- ibm-db==2.0.9
- ibmcloudsql==0.2.23
- idna==2.8
- incremental==17.5.0
- itsdangerous==1.1.0
- Jinja2==2.10
- jmespath==0.9.3
- kafka-python==1.4.4
- lxml==4.2.5
- MarkupSafe==1.1.0
- numpy==1.15.4
- pandas==0.23.4
- parsel==1.5.1
- pika==0.12.0
- Pillow==5.3.0
- protobuf==3.6.1
- psycopg2==2.7.6.1
- pyarrow==0.11.1
- pyasn1==0.4.4
- pyasn1-modules==0.2.2
- pycparser==2.19
- PyDispatcher==2.0.5
- PyHamcrest==1.9.0
- pymongo==3.7.2
- pyOpenSSL==18.0.0
- python-dateutil==2.7.5
- pytz==2018.7
- queuelib==1.5.0
- redis==3.0.1
- requests==2.21.0
- scikit-learn==0.20.1
- scipy==1.1.0
- Scrapy==1.5.1
- service-identity==18.1.0
- simplejson==3.16.0
- six==1.12.0
- tenacity==5.0.2
- tornado==4.5.2
- Twisted==18.9.0
- urllib3==1.24.1
- virtualenv==16.1.0
- w3lib==1.19.0
- watson-developer-cloud==2.5.1
- websocket-client==0.48.0
- Werkzeug==0.14.1
- zope.interface==4.6.0

## 1.3.0
- update kafka_python from `1.4.3` back to `1.4.4`
- update requests from `2.20.0` back to `2.20.1`
- update virtualenv from `16.0.0` back to `16.1.0`
- update twisted from `18.7.0` back to `18.9.0`
- update scikit-learn from `0.20.0` back to `0.20.1`
- update cloudant from `2.9.0` back to `2.10.1`
- update ibmcloudsql from `0.2.21` back to `0.2.23`
- update psycopg2 from `2.7.5` back to `2.7.6.1`
- update redis from `2.10.6` back to `3.0.1`
- update elasticsearch from `5.5.3` back to `6.3.1`
- update cassandra-driver from `3.15.1` back to `3.16.0`

Python version:
- [3.7.1](https://github.com/docker-library/python/blob/39c500cc8aefcb67a76d518d789441ef85fc771f/3.7/stretch/Dockerfile)

Python packages:
- asn1crypto==0.24.0
- attrs==18.2.0
- Automat==0.7.0
- beautifulsoup4==4.6.3
- botocore==1.12.57
- cassandra-driver==3.16.0
- certifi==2018.11.29
- cffi==1.11.5
- chardet==3.0.4
- Click==7.0
- cloudant==2.10.1
- constantly==15.1.0
- cryptography==2.4.2
- cssselect==1.0.3
- docutils==0.14
- elasticsearch==6.3.1
- Flask==1.0.2
- gevent==1.3.7
- greenlet==0.4.15
- httplib2==0.11.3
- hyperlink==18.0.0
- ibm-cos-sdk==2.3.3
- ibm-db==2.0.9
- ibmcloudsql==0.2.23
- idna==2.7
- incremental==17.5.0
- itsdangerous==1.1.0
- Jinja2==2.10
- jmespath==0.9.3
- kafka-python==1.4.4
- lxml==4.2.5
- MarkupSafe==1.1.0
- numpy==1.15.4
- pandas==0.23.4
- parsel==1.5.1
- pika==0.12.0
- Pillow==5.3.0
- psycopg2==2.7.6.1
- pyarrow==0.11.1
- pyasn1==0.4.4
- pyasn1-modules==0.2.2
- pycparser==2.19
- PyDispatcher==2.0.5
- PyHamcrest==1.9.0
- pymongo==3.7.2
- pyOpenSSL==18.0.0
- python-dateutil==2.7.5
- pytz==2018.7
- queuelib==1.5.0
- redis==3.0.1
- requests==2.20.1
- scikit-learn==0.20.1
- scipy==1.1.0
- Scrapy==1.5.1
- service-identity==17.0.0
- simplejson==3.16.0
- six==1.11.0
- tornado==4.5.2
- Twisted==18.9.0
- urllib3==1.24.1
- virtualenv==16.1.0
- w3lib==1.19.0
- watson-developer-cloud==2.4.4
- websocket-client==0.47.0
- Werkzeug==0.14.1
- zope.interface==4.6.0

## 1.2.0
- update gevent from `1.3.6` back to `1.3.7`
- update python-dateutil from `2.7.3` back to `2.7.5`
- update requests from `2.19.1` back to `2.20.0`
- update numpy from `1.15.2` back to `1.15.4`
- update Pillow from `5.2.0` back to `5.3.0`
- update ibm-cos-sdk from `2.3.0` back to `2.3.3`
- update ibmcloudsql from `0.2.13` back to `0.2.21`
- update pymongo from `3.7.1` back to `3.7.2`
- update watson-developer-cloud from `2.1.0` back to `2.4.1`

Python version:
- [3.7.1](https://github.com/docker-library/python/blob/4437475f468147e441561c3906806ef2cceea409/3.7/stretch/slim/Dockerfile)

Python packages:
- asn1crypto==0.24.0
- attrs==18.2.0
- Automat==0.7.0
- beautifulsoup4==4.6.3
- botocore==1.12.39
- cassandra-driver==3.15.1
- certifi==2018.10.15
- cffi==1.11.5
- chardet==3.0.4
- Click==7.0
- cloudant==2.9.0
- constantly==15.1.0
- cryptography==2.3.1
- cssselect==1.0.3
- docutils==0.14
- elasticsearch==5.5.3
- Flask==1.0.2
- gevent==1.3.7
- greenlet==0.4.15
- httplib2==0.11.3
- hyperlink==18.0.0
- ibm-cos-sdk==2.3.3
- ibm-cos-sdk-core==2.3.3
- ibm-cos-sdk-s3transfer==2.3.3
- ibm-db==2.0.9
- ibmcloudsql==0.2.21
- idna==2.7
- incremental==17.5.0
- itsdangerous==1.1.0
- Jinja2==2.10
- jmespath==0.9.3
- kafka-python==1.4.3
- lxml==4.2.5
- MarkupSafe==1.1.0
- numpy==1.15.4
- pandas==0.23.4
- parsel==1.5.1
- pika==0.12.0
- Pillow==5.3.0
- psycopg2==2.7.5
- pyarrow==0.11.1
- pyasn1==0.4.4
- pyasn1-modules==0.2.2
- pycparser==2.19
- PyDispatcher==2.0.5
- PyHamcrest==1.9.0
- pymongo==3.7.2
- pyOpenSSL==18.0.0
- python-dateutil==2.7.5
- pytz==2018.7
- queuelib==1.5.0
- redis==2.10.6
- requests==2.20.0
- scikit-learn==0.20.0
- scipy==1.1.0
- Scrapy==1.5.1
- service-identity==17.0.0
- simplejson==3.16.0
- six==1.11.0
- tornado==4.5.2
- Twisted==18.7.0
- urllib3==1.24.1
- virtualenv==16.0.0
- w3lib==1.19.0
- watson-developer-cloud==2.4.1
- websocket-client==0.47.0
- Werkzeug==0.14.1
- zope.interface==4.6.0

## 1.1.0
- revert cloudant from `2.10.0` back to `2.9.0`

Python version:
- [3.7.0](https://github.com/docker-library/python/blob/master/3.7/stretch/Dockerfile)

Python packages:
- asn1crypto==0.24.0
- attrs==18.2.0
- Automat==0.7.0
- beautifulsoup4==4.6.3
- botocore==1.12.30
- cassandra-driver==3.15.1
- certifi==2018.10.15
- cffi==1.11.5
- chardet==3.0.4
- Click==7.0
- cloudant==2.9.0
- constantly==15.1.0
- cryptography==2.3.1
- cssselect==1.0.3
- docutils==0.14
- elasticsearch==5.5.3
- Flask==1.0.2
- gevent==1.3.6
- greenlet==0.4.15
- httplib2==0.11.3
- hyperlink==18.0.0
- ibm-cos-sdk==2.3.0
- ibm-db==2.0.9
- ibmcloudsql==0.2.13
- idna==2.7
- incremental==17.5.0
- ItsDangerous==1.0.0
- Jinja2==2.10
- jmespath==0.9.3
- kafka-python==1.4.3
- lxml==4.2.5
- MarkupSafe==1.0
- numpy==1.15.2
- pandas==0.23.4
- parsel==1.5.0
- pika==0.12.0
- Pillow==5.2.0
- psycopg2==2.7.5
- pyasn1==0.4.4
- pyasn1-modules==0.2.2
- pycparser==2.19
- PyDispatcher==2.0.5
- PyHamcrest==1.9.0
- pymongo==3.7.1
- pyOpenSSL==18.0.0
- python-dateutil==2.7.3
- pytz==2018.5
- queuelib==1.5.0
- redis==2.10.6
- requests==2.19.1
- scikit-learn==0.20.0
- scipy==1.1.0
- Scrapy==1.5.1
- service-identity==17.0.0
- simplejson==3.16.0
- six==1.11.0
- tornado==4.5.2
- Twisted==18.7.0
- urllib3==1.23
- virtualenv==16.0.0
- w3lib==1.19.0
- watson-developer-cloud==2.1.0
- websocket-client==0.47.0
- Werkzeug==0.14.1
- zope.interface==4.6.0

## 1.0.0
Python version:
- [3.7.0](https://github.com/docker-library/python/blob/master/3.7/stretch/Dockerfile)

Python packages:
- asn1crypto==0.24.0
- attrs==18.2.0
- Automat==0.7.0
- beautifulsoup4==4.6.3
- botocore==1.12.13
- cassandra-driver==3.15.1
- certifi==2018.8.24
- cffi==1.11.5
- chardet==3.0.4
- Click==7.0
- cloudant==2.10.0
- constantly==15.1.0
- cryptography==2.3.1
- cssselect==1.0.3
- docutils==0.14
- elasticsearch==5.5.3
- Flask==1.0.2
- gevent==1.3.6
- greenlet==0.4.15
- httplib2==0.11.3
- hyperlink==18.0.0
- ibm-cos-sdk==2.3.0
- ibm-db==2.0.9
- ibmcloudsql==0.2.13
- idna==2.7
- incremental==17.5.0
- itsdangerous==0.24
- Jinja2==2.10
- jmespath==0.9.3
- kafka-python==1.4.3
- lxml==4.2.5
- MarkupSafe==1.0
- numpy==1.15.2
- pandas==0.23.4
- parsel==1.5.0
- pika==0.12.0
- Pillow==5.2.0
- psycopg2==2.7.5
- pyasn1==0.4.4
- pyasn1-modules==0.2.2
- pycparser==2.19
- PyDispatcher==2.0.5
- PyHamcrest==1.9.0
- pymongo==3.7.1
- pyOpenSSL==18.0.0
- python-dateutil==2.7.3
- pytz==2018.5
- queuelib==1.5.0
- redis==2.10.6
- requests==2.19.1
- scikit-learn==0.20.0
- scipy==1.1.0
- Scrapy==1.5.1
- service-identity==17.0.0
- simplejson==3.16.0
- six==1.11.0
- tornado==4.5.2
- Twisted==18.7.0
- urllib3==1.23
- virtualenv==16.0.0
- w3lib==1.19.0
- watson-developer-cloud==2.1.0
- websocket-client==0.47.0
- Werkzeug==0.14.1
- zope.interface==4.5.0
