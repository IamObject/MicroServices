FROM openjdk:11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} orderservice.jar

ENTRYPOINT ["java", "-jar", "/orderservice.jar"]

EXPOSE 9094

#docker build -t orderservice:latest .
#docker run -d -p9094:9094 --name orderservice a7a07f2691db
#docker run -d -p9094:9094 -e EUREKA_SERVER_ADDRESS=http://host.docker.internal:8761/eureka  -e DB_HOST=host.docker.internal -e CONFIG_SERVER_URL=host.docker.internal --name orderservice edef77d73add

#docker tag orderservice:latest sumitrokade/iod:orderservice
#docker push sumitrokade/iod:orderservice
