FROM openjdk:17-jdk-slim               
VOLUME /tmp                 
EXPOSE 8080                 
ADD target/dockerSample-1-0.0.1-SNAPSHOT.jar  dockerSample-1-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-jar","dockerSample-1-0.0.1-SNAPSHOT.jar"] 

