FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/payment-type-service-0.0.1.jar
COPY ${JAR_FILE} payment-type-service.jar
ENTRYPOINT ["java","-jar","payment-type-service.jar"]