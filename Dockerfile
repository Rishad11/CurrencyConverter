FROM eclipse-temurin:21-jre

WORKDIR /app

COPY Consumer/target/Consumer-1.0-SNAPSHOT.jar /app/
COPY Provider/target/Provider-1.0-SNAPSHOT.jar /app/
COPY Service/target/Service-1.0-SNAPSHOT.jar /app/

ENTRYPOINT ["java", "--module-path", "/app", "--module", "Consumer/org.example.consumer.Main"]
