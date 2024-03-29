FROM maven:3-openjdk-17 As build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/demo-0.0.1-SNAPSHOP.jar demo
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo.jar"]