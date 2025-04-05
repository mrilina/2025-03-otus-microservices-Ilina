FROM openjdk:21
ARG JAR_FILE=target/otus-healthcheck-04-2025-1.0.0.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]