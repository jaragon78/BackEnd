
FROM amazoncorretto:17-alpine-jdk
MAINTAINER jaragon
COPY Portfolio-0.0.1-SNAPSHOT.jar Portfolio-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","Portfolio-0.0.1-SNAPSHOT.jar"]
