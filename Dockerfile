FROM openjdk:11.0.1-jre-slim-stretch
EXPOSE 80
ARG JAR=spring-petclinic-rest-2.6.2.jar
COPY target/$JAR /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]