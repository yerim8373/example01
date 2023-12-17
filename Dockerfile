#Build stage
FROM gradle:8.5.0-jdk as builder
WORKDIR /app

COPY . /app
RUN gradle build

#Run stage
FROM openjdk:23-slim
WORKDIR /app

COPY --from=builder /app/build/libs/*.jar /app/app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
