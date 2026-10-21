FROM amazoncorretto:17-alpine
WORKDIR /ecr
COPY target/*.jar ECR-0.0.1-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "ECR-0.0.1-SNAPSHOT.jar"]