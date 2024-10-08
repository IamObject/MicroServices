FROM openjdk:11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} serviceregistry.jar

ENTRYPOINT ["java", "-jar", "/serviceregistry.jar"]


EXPOSE 8761

#docker build -t serviceregistry:latest .
#docker run -d -p8761:8761 --name serviceregistry b85321fd04c0

#imp
#docker tag serviceregistry:latest sumitrokade/iod:serviceregistry
#docker push sumitrokade/iod:serviceregistry


#docker tag serviceregistry:latest sumitrokade/iod:serviceregistry
#docker push sumitrokade/iod:serviceregistry

