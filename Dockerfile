
FROM amazoncorretto:17-alpine-jdk
MAINTAINER jaragon
COPY Portfolio-0.0.1-SNAPSHOT.jar.jar Portfolio-0.0.1-SNAPSHOT.jar.jar
ENTRYPOINT ["java","-jar","Portfolio-0.0.1-SNAPSHOT.jar"]
