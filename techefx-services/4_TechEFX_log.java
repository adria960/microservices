$ mkdir techefx-services


Jaca@DESKTOP-G102BV9 MINGW64 /e/000/techefx-services
$ git --version
git version 2.25.1.windows.1


Jaca@DESKTOP-G102BV9 MINGW64 /e/000/techefx-services
$ git clone https://github.com/techefx/techefx-eureka-naming-server.git
Cloning into 'techefx-eureka-naming-server'...
remote: Enumerating objects: 50, done.
remote: Counting objects: 100% (50/50), done.
remote: Compressing objects: 100% (32/32), done.
remote: Total 50 (delta 11), reused 48 (delta 9), pack-reused 0
Unpacking objects: 100% (50/50), 15.43 KiB | 9.00 KiB/s, done.

Jaca@DESKTOP-G102BV9 MINGW64 /e/000/techefx-services
$ dir
techefx-eureka-naming-server

Jaca@DESKTOP-G102BV9 MINGW64 /e/000/techefx-services
$ cd techefx-eureka-naming-server/

Jaca@DESKTOP-G102BV9 MINGW64 /e/000/techefx-services/techefx-eureka-naming-server (master)
$ ls -lt
total 53
-rw-r--r-- 1 Jaca 197121 22907 Mar 22 03:11 techefx-eureka-naming-server.iml
drwxr-xr-x 1 Jaca 197121     0 Mar 22 03:11 src/
-rw-r--r-- 1 Jaca 197121  6790 Mar 22 03:11 mvnw.cmd
-rw-r--r-- 1 Jaca 197121  3682 Mar 22 03:11 pom.xml
-rwxr-xr-x 1 Jaca 197121 10380 Mar 22 03:11 mvnw*
-rw-r--r-- 1 Jaca 197121   760 Mar 22 03:11 HELP.md
-rw-r--r-- 1 Jaca 197121   199 Mar 22 03:11 Dockerfile

Jaca@DESKTOP-G102BV9 MINGW64 /e/000/techefx-services/techefx-eureka-naming-server (master)
$ cd ..

Jaca@DESKTOP-G102BV9 MINGW64 /e/000/techefx-services
$ ls -lt
total 4
drwxr-xr-x 1 Jaca 197121 0 Mar 22 03:11 techefx-eureka-naming-server/

Jaca@DESKTOP-G102BV9 MINGW64 /e/000/techefx-services
$ git clone https://github.com/techefx/techefx-zuul-api-gateway-server.git
Cloning into 'techefx-zuul-api-gateway-server'...
remote: Enumerating objects: 28, done.
remote: Counting objects: 100% (28/28), done.
remote: Compressing objects: 100% (17/17), done.
remote: Total 28 (delta 1), reused 28 (delta 1), pack-reused 0
Unpacking objects: 100% (28/28), 12.05 KiB | 13.00 KiB/s, done.

Jaca@DESKTOP-G102BV9 MINGW64 /e/000/techefx-services
$ cd ..

Jaca@DESKTOP-G102BV9 MINGW64 /e/000
$ git clone https://github.com/techefx/techefx-product-stock-service.git
Cloning into 'techefx-product-stock-service'...
remote: Enumerating objects: 83, done.
remote: Counting objects: 100% (83/83), done.
remote: Compressing objects: 100% (55/55), done.
remote: Total 83 (delta 27), reused 74 (delta 18), pack-reused 0
Unpacking objects: 100% (83/83), 21.66 KiB | 6.00 KiB/s, done.
                                 idea-microservices-techie         techefx-services

Jaca@DESKTOP-G102BV9 MINGW64 /e/000

Jaca@DESKTOP-G102BV9 MINGW64 /e/000/techefx-services
$ ls -l
total 8
drwxr-xr-x 1 Jaca 197121 0 Mar 22 03:11 techefx-eureka-naming-server/
drwxr-xr-x 1 Jaca 197121 0 Mar 22 03:13 techefx-zuul-api-gateway-server/

Jaca@DESKTOP-G102BV9 MINGW64 /e/000/techefx-services
$ git clone https://github.com/techefx/techefx-product-enquiry-service.git
Cloning into 'techefx-product-enquiry-service'...
remote: Enumerating objects: 50, done.
remote: Counting objects: 100% (50/50), done.
remote: Compressing objects: 100% (33/33), done.
remote: Total 50 (delta 9), reused 47 (delta 6), pack-reused 0
Unpacking objects: 100% (50/50), 16.55 KiB | 8.00 KiB/s, done.

Jaca@DESKTOP-G102BV9 MINGW64 /e/000/techefx-services
$ ls -l
total 16
drwxr-xr-x 1 Jaca 197121 0 Mar 22 03:11 techefx-eureka-naming-server/
drwxr-xr-x 1 Jaca 197121 0 Mar 22 03:16 techefx-product-enquiry-service/
drwxr-xr-x 1 Jaca 197121 0 Mar 22 03:14 techefx-product-stock-service/
drwxr-xr-x 1 Jaca 197121 0 Mar 22 03:13 techefx-zuul-api-gateway-server/

$ pwd
/e/000/techefx-services/techefx-eureka-naming-server

Jaca@DESKTOP-G102BV9 MINGW64 /e/000/techefx-services/techefx-eureka-naming-server (master)
$ mvn clean compile package
[INFO] Scanning for projects...
Downloading: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-parent/2.3.6.RELEASE/spring-boot-starter-parent-2.3.6.RELEASE.pom
...

2021-03-22 03:26:35.711  INFO [techefx-eureka-naming-server,,,] 14860 --- [extShutdownHook] com.netflix.discovery.DiscoveryClient    : Completed shut down of DiscoveryClient
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- maven-jar-plugin:3.2.0:jar (default-jar) @ techefx-eureka-naming-server ---
[INFO] Building jar: E:\000\techefx-services\techefx-eureka-naming-server\target\techefx-eureka-naming-server-0.0.1-SNAPSHOT.jar
[INFO]
[INFO] --- spring-boot-maven-plugin:2.3.6.RELEASE:repackage (repackage) @ techefx-eureka-naming-server ---
Downloading: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-buildpack-platform/2.3.6.RELEASE/spring-boot-buildpack-platform-2.3.6.RELEASE.pom
Downloaded: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-buildpack-platform/2.3.6.RELEASE/spring-boot-buildpack-platform-2.3.6.RELEASE.pom (3.1 kB at 38 kB/s)
Downloading: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-loader-tools/2.3.6.RELEASE/spring-boot-loader-tools-2.3.6.RELEASE.pom
Downloaded: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-loader-tools/2.3.6.RELEASE/spring-boot-loader-tools-2.3.6.RELEASE.pom (2.3 kB at 13 kB/s)
Downloading: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-buildpack-platform/2.3.6.RELEASE/spring-boot-buildpack-platform-2.3.6.RELEASE.jar
Downloading: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-loader-tools/2.3.6.RELEASE/spring-boot-loader-tools-2.3.6.RELEASE.jar
Downloaded: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-buildpack-platform/2.3.6.RELEASE/spring-boot-buildpack-platform-2.3.6.RELEASE.jar (183 kB at 1.0 MB/s)
Downloaded: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-loader-tools/2.3.6.RELEASE/spring-boot-loader-tools-2.3.6.RELEASE.jar (241 kB at 946 kB/s)
[INFO] Replacing main artifact with repackaged archive
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 01:29 min
[INFO] Finished at: 2021-03-22T03:26:38+01:00
[INFO] Final Memory: 48M/389M
[INFO] ------------------------------------------------------------------------

Jaca@DESKTOP-G102BV9 MINGW64 /e/000/techefx-services/techefx-eureka-naming-server (master)
$ dir
Dockerfile  HELP.md  mvnw  mvnw.cmd  pom.xml  src  target  techefx-eureka-naming-server.iml


Jaca@DESKTOP-G102BV9 MINGW64 /e/000/techefx-services/techefx-eureka-naming-server (master)

$ docker build --pull --rm -f Dockerfile -t techefx-eureka-naming-server:latest .
#1 [internal] load build definition from Dockerfile
#1 sha256:9a74447a3323d3e26a64347393a26e897195eec776ee85c633278f36abde0c92
#1 transferring dockerfile: 225B done
#1 DONE 0.1s

#2 [internal] load .dockerignore
#2 sha256:644146bfe90e40476068cdc19167bc20d9ba8abc37a5eb3b7e02f291b70b4c19
#2 transferring context: 2B done
#2 DONE 0.1s

#3 [internal] load metadata for docker.io/library/adoptopenjdk:8-jre
#3 sha256:8b47b1d2e5e5dbd403198b05a71dedf3beab8d93150285fb399f001df6168afb
#3 ...

#4 [auth] library/adoptopenjdk:pull token for registry-1.docker.io
#4 sha256:9368026acfc7d63c147bbebfec2765e0a3539fab1eb43f1534421a05ce00f52a
#4 DONE 0.0s

#3 [internal] load metadata for docker.io/library/adoptopenjdk:8-jre
#3 sha256:8b47b1d2e5e5dbd403198b05a71dedf3beab8d93150285fb399f001df6168afb
#3 DONE 3.4s

#5 [1/2] FROM docker.io/library/adoptopenjdk:8-jre@sha256:d233783e4db4c69bf55288c82e700e6063be99fc14dbc821cbf12a049f83b118
#5 sha256:843b33b7c226a11b6612dff49c33530e76b3e196988c72e0e34c1719aaeeffbb
#5 resolve docker.io/library/adoptopenjdk:8-jre@sha256:d233783e4db4c69bf55288c82e700e6063be99fc14dbc821cbf12a049f83b118 0.0s done
#5 sha256:3fc2062ea6672189447be7510fb7d5bc2ef2fda234a04b457d9dda4bba5cc635 0B / 850B 0.1s
#5 sha256:75adf526d75b82eb4f9981cce0b23608ebe6ab85c3e1ab2441f29b302d2f9aa8 0B / 162B 0.1s
#5 sha256:d233783e4db4c69bf55288c82e700e6063be99fc14dbc821cbf12a049f83b118 1.24kB / 1.24kB done
#5 sha256:4c3e1131d9c867663939d7d7ebf7377983873eea1f14326947c0f1c82193c3a0 1.37kB / 1.37kB done
#5 sha256:ad2c5801425d25d30d1129a3bed2f977c59de3ec42322a0f49ae8baebc2ee04b 6.40kB / 6.40kB done
#5 sha256:5d3b2c2d21bba59850dac063bcbb574fddcb6aefb444ffcc63843355d878d54f 0B / 28.57MB 0.1s
#5 sha256:3fc2062ea6672189447be7510fb7d5bc2ef2fda234a04b457d9dda4bba5cc635 850B / 850B 0.6s done
#5 sha256:75adf526d75b82eb4f9981cce0b23608ebe6ab85c3e1ab2441f29b302d2f9aa8 162B / 162B 0.6s done
#5 sha256:9518218b2233c77fd5243c049d5658f63fc2afc0271444ebcfec2ddf1d14d7ed 0B / 16.03MB 0.7s
#5 sha256:7a64ca1bc607a6e2222edcb008d509909a5fe3f10e323866166bfde5f205a7c0 0B / 41.72MB 0.7s
#5 ...

#7 [internal] load build context
#7 sha256:20ff1d8f9c31e9b55b12afcff16ee069a773c86f213a7376d5b7947af8217d9d
#7 transferring context: 51.95MB 1.0s done
#7 DONE 1.0s

#5 [1/2] FROM docker.io/library/adoptopenjdk:8-jre@sha256:d233783e4db4c69bf55288c82e700e6063be99fc14dbc821cbf12a049f83b118
#5 sha256:843b33b7c226a11b6612dff49c33530e76b3e196988c72e0e34c1719aaeeffbb
#5 sha256:5d3b2c2d21bba59850dac063bcbb574fddcb6aefb444ffcc63843355d878d54f 2.10MB / 28.57MB 1.2s
#5 sha256:9518218b2233c77fd5243c049d5658f63fc2afc0271444ebcfec2ddf1d14d7ed 1.05MB / 16.03MB 2.0s
#5 sha256:5d3b2c2d21bba59850dac063bcbb574fddcb6aefb444ffcc63843355d878d54f 4.19MB / 28.57MB 2.9s
#5 sha256:9518218b2233c77fd5243c049d5658f63fc2afc0271444ebcfec2ddf1d14d7ed 2.10MB / 16.03MB 3.2s
#5 sha256:9518218b2233c77fd5243c049d5658f63fc2afc0271444ebcfec2ddf1d14d7ed 3.15MB / 16.03MB 4.2s
#5 sha256:7a64ca1bc607a6e2222edcb008d509909a5fe3f10e323866166bfde5f205a7c0 2.10MB / 41.72MB 5.0s
#5 sha256:9518218b2233c77fd5243c049d5658f63fc2afc0271444ebcfec2ddf1d14d7ed 4.19MB / 16.03MB 5.2s
#5 sha256:5d3b2c2d21bba59850dac063bcbb574fddcb6aefb444ffcc63843355d878d54f 6.29MB / 28.57MB 5.3s
#5 sha256:9518218b2233c77fd5243c049d5658f63fc2afc0271444ebcfec2ddf1d14d7ed 5.24MB / 16.03MB 6.2s
#5 sha256:9518218b2233c77fd5243c049d5658f63fc2afc0271444ebcfec2ddf1d14d7ed 6.29MB / 16.03MB 7.2s
#5 sha256:5d3b2c2d21bba59850dac063bcbb574fddcb6aefb444ffcc63843355d878d54f 8.39MB / 28.57MB 7.9s
#5 sha256:9518218b2233c77fd5243c049d5658f63fc2afc0271444ebcfec2ddf1d14d7ed 7.34MB / 16.03MB 8.0s
#5 sha256:9518218b2233c77fd5243c049d5658f63fc2afc0271444ebcfec2ddf1d14d7ed 8.39MB / 16.03MB 8.9s
#5 sha256:7a64ca1bc607a6e2222edcb008d509909a5fe3f10e323866166bfde5f205a7c0 4.19MB / 41.72MB 9.7s
#5 sha256:9518218b2233c77fd5243c049d5658f63fc2afc0271444ebcfec2ddf1d14d7ed 9.44MB / 16.03MB 9.8s
#5 sha256:5d3b2c2d21bba59850dac063bcbb574fddcb6aefb444ffcc63843355d878d54f 10.49MB / 28.57MB 10.3s
#5 sha256:9518218b2233c77fd5243c049d5658f63fc2afc0271444ebcfec2ddf1d14d7ed 10.49MB / 16.03MB 11.0s
#5 sha256:9518218b2233c77fd5243c049d5658f63fc2afc0271444ebcfec2ddf1d14d7ed 11.53MB / 16.03MB 12.0s
#5 sha256:5d3b2c2d21bba59850dac063bcbb574fddcb6aefb444ffcc63843355d878d54f 12.58MB / 28.57MB 12.9s
#5 sha256:7a64ca1bc607a6e2222edcb008d509909a5fe3f10e323866166bfde5f205a7c0 6.29MB / 41.72MB 12.9s
#5 sha256:9518218b2233c77fd5243c049d5658f63fc2afc0271444ebcfec2ddf1d14d7ed 12.58MB / 16.03MB 13.1s
#5 sha256:9518218b2233c77fd5243c049d5658f63fc2afc0271444ebcfec2ddf1d14d7ed 13.63MB / 16.03MB 14.1s
#5 sha256:5d3b2c2d21bba59850dac063bcbb574fddcb6aefb444ffcc63843355d878d54f 14.68MB / 28.57MB 15.4s
#5 sha256:9518218b2233c77fd5243c049d5658f63fc2afc0271444ebcfec2ddf1d14d7ed 14.68MB / 16.03MB 15.4s
#5 sha256:7a64ca1bc607a6e2222edcb008d509909a5fe3f10e323866166bfde5f205a7c0 8.39MB / 41.72MB 16.1s
#5 sha256:9518218b2233c77fd5243c049d5658f63fc2afc0271444ebcfec2ddf1d14d7ed 15.73MB / 16.03MB 16.3s
#5 sha256:9518218b2233c77fd5243c049d5658f63fc2afc0271444ebcfec2ddf1d14d7ed 16.03MB / 16.03MB 16.7s done
#5 sha256:7a64ca1bc607a6e2222edcb008d509909a5fe3f10e323866166bfde5f205a7c0 10.49MB / 41.72MB 17.7s
#5 sha256:5d3b2c2d21bba59850dac063bcbb574fddcb6aefb444ffcc63843355d878d54f 16.78MB / 28.57MB 18.0s
#5 sha256:7a64ca1bc607a6e2222edcb008d509909a5fe3f10e323866166bfde5f205a7c0 12.58MB / 41.72MB 19.0s
#5 sha256:5d3b2c2d21bba59850dac063bcbb574fddcb6aefb444ffcc63843355d878d54f 18.87MB / 28.57MB 20.2s
#5 sha256:7a64ca1bc607a6e2222edcb008d509909a5fe3f10e323866166bfde5f205a7c0 14.68MB / 41.72MB 20.4s
#5 sha256:5d3b2c2d21bba59850dac063bcbb574fddcb6aefb444ffcc63843355d878d54f 20.97MB / 28.57MB 22.1s
#5 sha256:7a64ca1bc607a6e2222edcb008d509909a5fe3f10e323866166bfde5f205a7c0 16.78MB / 41.72MB 22.1s
#5 sha256:7a64ca1bc607a6e2222edcb008d509909a5fe3f10e323866166bfde5f205a7c0 18.87MB / 41.72MB 23.6s
#5 sha256:5d3b2c2d21bba59850dac063bcbb574fddcb6aefb444ffcc63843355d878d54f 23.07MB / 28.57MB 24.0s
#5 sha256:7a64ca1bc607a6e2222edcb008d509909a5fe3f10e323866166bfde5f205a7c0 20.97MB / 41.72MB 25.2s
#5 sha256:5d3b2c2d21bba59850dac063bcbb574fddcb6aefb444ffcc63843355d878d54f 25.17MB / 28.57MB 26.1s
#5 sha256:7a64ca1bc607a6e2222edcb008d509909a5fe3f10e323866166bfde5f205a7c0 23.07MB / 41.72MB 26.6s
#5 sha256:5d3b2c2d21bba59850dac063bcbb574fddcb6aefb444ffcc63843355d878d54f 27.26MB / 28.57MB 27.9s
#5 sha256:7a64ca1bc607a6e2222edcb008d509909a5fe3f10e323866166bfde5f205a7c0 25.17MB / 41.72MB 28.3s
#5 sha256:5d3b2c2d21bba59850dac063bcbb574fddcb6aefb444ffcc63843355d878d54f 28.57MB / 28.57MB 29.1s done
#5 extracting sha256:5d3b2c2d21bba59850dac063bcbb574fddcb6aefb444ffcc63843355d878d54f
#5 sha256:7a64ca1bc607a6e2222edcb008d509909a5fe3f10e323866166bfde5f205a7c0 27.26MB / 41.72MB 29.5s
#5 sha256:7a64ca1bc607a6e2222edcb008d509909a5fe3f10e323866166bfde5f205a7c0 29.36MB / 41.72MB 30.3s
#5 sha256:7a64ca1bc607a6e2222edcb008d509909a5fe3f10e323866166bfde5f205a7c0 31.46MB / 41.72MB 31.2s
#5 extracting sha256:5d3b2c2d21bba59850dac063bcbb574fddcb6aefb444ffcc63843355d878d54f 2.2s done
#5 extracting sha256:3fc2062ea6672189447be7510fb7d5bc2ef2fda234a04b457d9dda4bba5cc635 done
#5 extracting sha256:75adf526d75b82eb4f9981cce0b23608ebe6ab85c3e1ab2441f29b302d2f9aa8 done
#5 extracting sha256:9518218b2233c77fd5243c049d5658f63fc2afc0271444ebcfec2ddf1d14d7ed 0.1s
#5 sha256:7a64ca1bc607a6e2222edcb008d509909a5fe3f10e323866166bfde5f205a7c0 33.55MB / 41.72MB 32.2s
#5 sha256:7a64ca1bc607a6e2222edcb008d509909a5fe3f10e323866166bfde5f205a7c0 35.65MB / 41.72MB 32.9s
#5 extracting sha256:9518218b2233c77fd5243c049d5658f63fc2afc0271444ebcfec2ddf1d14d7ed 1.4s done
#5 sha256:7a64ca1bc607a6e2222edcb008d509909a5fe3f10e323866166bfde5f205a7c0 37.75MB / 41.72MB 33.9s
#5 sha256:7a64ca1bc607a6e2222edcb008d509909a5fe3f10e323866166bfde5f205a7c0 39.85MB / 41.72MB 34.6s
#5 sha256:7a64ca1bc607a6e2222edcb008d509909a5fe3f10e323866166bfde5f205a7c0 41.72MB / 41.72MB 35.5s done
#5 extracting sha256:7a64ca1bc607a6e2222edcb008d509909a5fe3f10e323866166bfde5f205a7c0 0.1s
#5 extracting sha256:7a64ca1bc607a6e2222edcb008d509909a5fe3f10e323866166bfde5f205a7c0 1.9s done
#5 DONE 37.8s

#6 [2/2] COPY target/*.jar app.jar
#6 sha256:12b89134559835f84c60991ea5d09f617ef0a39a8b4ab23d3941f252700cb8f1
#6 DONE 0.9s

#8 exporting to image
#8 sha256:e8c613e07b0b7ff33893b694f7759a10d42e180f2b4dc349fb57dc6b71dcab00
#8 exporting layers
#8 exporting layers 0.4s done
#8 writing image sha256:e98e1bb3d470bbab358e7fd18e5d903244a28ed0fc9987d3f1de295a30a53c55 done
#8 naming to docker.io/library/techefx-eureka-naming-server:latest done
#8 DONE 0.4s

Jaca@DESKTOP-G102BV9 MINGW64 /e/000/techefx-services/techefx-eureka-naming-server (master)
$
