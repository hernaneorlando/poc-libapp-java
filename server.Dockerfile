FROM eclipse-temurin:21-jdk-jammy
WORKDIR /src
COPY ./backend ./
RUN apt-get update && apt-get install -y maven
RUN mvn install -DskipTests

WORKDIR /app
RUN cp /src/target/library-app-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]
EXPOSE 8080