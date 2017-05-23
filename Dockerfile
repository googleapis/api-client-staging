FROM openjdk:7

WORKDIR /api-client-staging

ADD . /api-client-staging

RUN ./generated/java/gradlew -p ./generated/java clean test