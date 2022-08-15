FROM adoptopenjdk/openjdk15:ubi
VOLUME /tmp
ADD target/SpringbootDockerEx-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]