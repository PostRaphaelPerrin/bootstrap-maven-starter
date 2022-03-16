FROM openjdk:11-jre-slim

COPY target/core-it-suite-2.1-SNAPSHOT.jar /usr/local/lib/core-it-suite.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/core-it-suite.jar"]
