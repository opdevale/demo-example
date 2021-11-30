# Build the application first using Maven
FROM maven:3.8-openjdk-11 as build
WORKDIR /app
COPY . .
RUN mvn install

# Inject the JAR file into a new container to keep the file small
FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/demo-example-*.jar /app/app.jar
EXPOSE 8090
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar app.jar"]
