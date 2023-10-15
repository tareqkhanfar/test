FROM openjdk:19-jdk
WORKDIR /app
COPY /target/sayhello-runner.jar /app/sayhello-runner.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/sayhello-runner.jar"]


