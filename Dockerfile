# Sử dụng JDK base image
FROM eclipse-temurin:23-jdk-alpine

# Copy file JAR vào container
COPY build/libs/*.jar app.jar

# Expose cổng để ứng dụng có thể truy cập
EXPOSE 8080

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "app.jar"]
