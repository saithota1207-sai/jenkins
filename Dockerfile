FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copy the jar built by Maven
COPY target/jenkins-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 7700

ENTRYPOINT ["java", "-jar", "jenkindemo.jar"]