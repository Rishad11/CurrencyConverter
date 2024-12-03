FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

COPY ./Consumer/target/Service-1.0-SNAPSHOT.jar /app
COPY ./Provider/target/Provider-1.0-SNAPSHOT.jar /app
COPY ./Service/target/Consumer-1.0-SNAPSHOT.jar /app

ENTRYPOINT ["java", "--module-path", "/app", "--module", "org.example.consumer.main"]
