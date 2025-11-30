# Dockerfile para Eureka
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
# AQUÍ ESTÁ EL CAMBIO: Usamos el nombre que sale en tu imagen
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","/app/app.jar"]