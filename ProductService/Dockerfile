FROM openjdk:11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} productservice.jar

ENTRYPOINT ["java", "-jar", "/productservice.jar"]

EXPOSE 9096

#docker build -t productservice:latest .
###docker run -d -p9094:9094 --name orderservice a7a07f2691db
#docker run -d -p9096:9096 -e EUREKA_SERVER_ADDRESS=http://host.docker.internal:8761/eureka  -e DB_HOST=host.docker.internal -e CONFIG_SERVER_URL=host.docker.internal --name productservice b5657284f261



#docker tag productservice:latest sumitrokade/iod:productservice
#docker push sumitrokade/iod:productservice
