FROM openjdk:17-alpine

EXPOSE 8080

ADD target/springkube-0.0.1-SNAPSHOT.jar springkube-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/springkube-0.0.1-SNAPSHOT.jar"]
