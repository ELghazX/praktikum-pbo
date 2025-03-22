FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/posttest2-1.0-SNAPSHOT-jar-with-dependencies.jar /app/app.jar

CMD ["java", "-jar", "app.jar"]
