# Build stage
FROM eclipse-temurin:21 AS builder

WORKDIR /app
COPY . .
RUN ./gradlew build --no-daemon

# Runtime stage
FROM eclipse-temurin:21

WORKDIR /app
COPY --from=builder /app/build/libs/github-actions-boot-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]