# Stage 1: Build the application
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Run the application
# Use eclipse-temurin instead of the broken openjdk image
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
# This copies the JAR from the build stage to the run stage
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
