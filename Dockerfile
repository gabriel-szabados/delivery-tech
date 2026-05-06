FROM maven:3.9.10-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY src ./src
RUN mvn clean package -DskipTests

RUN mkdir -p /app/data && chmod -R 777 /app/data

FROM gcr.io/distroless/java21-debian12:nonroot
LABEL maintainer="Delivery Tech Team"
COPY --from=build /app/target/*.jar /app/delivery-api.jar

USER nonroot:nonroot
WORKDIR /app
EXPOSE 8080
ENTRYPOINT ["java", "-Xms256m", "-Xmx512m", "-Dspring.profiles.active=docker", "-jar", "/app/delivery-api.jar"]