FROM openjdk:11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} cloudgateway.jar

ENTRYPOINT ["java", "-jar", "/cloudgateway.jar"]

EXPOSE 9091
#
#docker build -t cloudgateway:latest .
#docker run -d -p9091:9091 --name cloudgateway 619541d68baa
#docker run -d -p9091:9091 -e EUREKA_SERVER_ADDRESS=http://host.docker.internal:8761/eureka  -e CONFIG_SERVER_URL=host.docker.internal --name cloudgateway 619541d68baa


#docker tag cloudgateway:latest sumitrokade/iod:cloudgateway
#docker push sumitrokade/iod:cloudgateway