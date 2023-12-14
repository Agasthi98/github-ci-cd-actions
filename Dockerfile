FROM openjdk:17
EXPOSE 8080
ADD target/github-action-demo-image-springboot.jar github-action-demo-image-springboot.jar
ENTRYPOINT ["java","-jar","/github-action-demo-image-springboot.jar"]