FROM openjdk:11-jre-slim
WORKDIR /app
COPY . /app
EXPOSE 8080
CMD ["java", "-jar", "build/libs/OnlineExaminationSystem-0.0.1-SNAPSHOT.jar"]


