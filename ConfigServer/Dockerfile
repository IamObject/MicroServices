FROM openjdk:11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} configserver.jar

ENTRYPOINT ["java", "-jar", "/configserver.jar"]

EXPOSE 9296
#
#docker build -t configserver .
#docker run -d -p9296:9296 --name configserver 9c86c9b99378
#docker run -d -p9296:9296 -e EUREKA_SERVER_ADDRESS=http://host.docker.internal:8761/eureka --name configserver 1bac66c2e0fe

#docker tag configserver:latest sumitrokade/iod:configserver
#docker push sumitrokade/iod:configserver