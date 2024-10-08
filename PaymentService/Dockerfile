FROM openjdk:11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} paymentservice.jar

ENTRYPOINT ["java", "-jar", "/paymentservice.jar"]

EXPOSE 9095

#docker build -t paymentservice:latest .
#docker run -d -p9094:9094 --name orderservice a7a07f2691db
#docker run -d -p9095:9095 -e EUREKA_SERVER_ADDRESS=http://host.docker.internal:8761/eureka  -e DB_HOST=host.docker.internal -e CONFIG_SERVER_URL=host.docker.internal --name paymentservice f6dfc1958c0b

#docker tag paymentservice:latest sumitrokade/iod:paymentservice
#docker push sumitrokade/iod:paymentservice
