Steps to run microservices
install docker and kubernetis on local
update mysql properties
run below commands to make docker images 
go inside k8s directory
run below commands 
kubectl apply -f ./k8s/                                                                                         
and see registry if all services are up


# MicroServices
Microservice 1 
Config Server
1. Build config server
   docker build -t configserver .
2. run config server
   docker run -d -p9296:9296 -e EUREKA_SERVER_ADDRESS=http://host.docker.internal:8761/eureka --name configserver 1bac66c2e0fe
3. Tag config server in local
   docker tag configserver:latest sumitrokade/iod:configserver
4. Push config server
   docker push sumitrokade/iod:configserver

Similar commands for other microservices mentioned below 

Microservice 2
#docker build -t cloudgateway:latest .
#docker run -d -p9091:9091 -e EUREKA_SERVER_ADDRESS=http://host.docker.internal:8761/eureka  -e CONFIG_SERVER_URL=host.docker.internal --name cloudgateway 619541d68baa
#docker tag cloudgateway:latest sumitrokade/iod:cloudgateway
#docker push sumitrokade/iod:cloudgateway


Microservice 3
#docker build -t orderservice:latest .
#docker run -d -p9094:9094 -e EUREKA_SERVER_ADDRESS=http://host.docker.internal:8761/eureka  -e DB_HOST=host.docker.internal -e CONFIG_SERVER_URL=host.docker.internal --name orderservice edef77d73add
#docker tag orderservice:latest sumitrokade/iod:orderservice
#docker push sumitrokade/iod:orderservice

Microservice 4
#docker build -t paymentservice:latest .
#docker run -d -p9095:9095 -e EUREKA_SERVER_ADDRESS=http://host.docker.internal:8761/eureka  -e DB_HOST=host.docker.internal -e CONFIG_SERVER_URL=host.docker.internal --name paymentservice f6dfc1958c0b
#docker tag paymentservice:latest sumitrokade/iod:paymentservice
#docker push sumitrokade/iod:paymentservice


Microservice 5 
#docker build -t productservice:latest .
#docker run -d -p9096:9096 -e EUREKA_SERVER_ADDRESS=http://host.docker.internal:8761/eureka  -e DB_HOST=host.docker.internal -e CONFIG_SERVER_URL=host.docker.internal --name productservice b5657284f261

#docker tag productservice:latest sumitrokade/iod:productservice
#docker push sumitrokade/iod:productservice


Microservice 6
#docker build -t serviceregistry:latest .
#docker run -d -p8761:8761 --name serviceregistry b85321fd04c0

#docker tag serviceregistry:latest sumitrokade/iod:serviceregistry
#docker push sumitrokade/iod:serviceregistry

If all services are up execute then
execute below curl to see output


curl --location 'http://127.0.0.1:49858/order/placeOrder' \
--header 'Content-Type: application/json' \
--data '{
"productId":1,
"totalAmount":1200,
"quantity":1,
"paymentMode":"CASH"

}'

