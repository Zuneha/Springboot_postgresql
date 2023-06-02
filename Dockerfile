FROM openjdk:11-jdk
WORKDIR /app

COPY target/springpostgres-0.0.1-SNAPSHOT.jar /app 


ENTRYPOINT ["java", "-jar", "springpostgres-0.0.1-SNAPSHOT.jar"]