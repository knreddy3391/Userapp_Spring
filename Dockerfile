FROM openjdk:8-alpine
WORKDIR /app
COPY "./target/UsersApp-0.0.2.jar" .
EXPOSE 9090
ENTRYPOINT ["java","-jar","UsersApp-0.0.2.jar"]
