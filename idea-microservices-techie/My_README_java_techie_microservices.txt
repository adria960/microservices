
THIS IS PART OF YOUTUBE with API Gateway, Registry, Order and Payment services - Hystrix (BEFORE Hystrix Dashboard integration):
-------------------------------------------------------------------------------------------
Microservice Using Spring Boot & Spring Cloud | 2 Hours Full Course | JavaTechie
https://www.youtube.com/watch?v=tljuDMmfJz8&list=PLVz2XdJiJQxxWhFkucZBoMxeYE6qTgEF8&index=9&ab_channel=JavaTechie

This is part of:
Agenda of this tutorial :
1. Create 2 microservice from scratch
2. Register microservice in Eureka Service Discovery
3. integrate Spring Cloud Gateway for routing user request
Integrate Hystrix

4. Integrate Hystrix & Hystrix Dashboard to identify failure for downstream services
5. Spring cloud config server using Git to Centralize configuration across application
6. ELK Stack to centralize logging across all microservices
7. Zipkin & Sleuth to centralize tracing in microservice architecture

https://github.com/Java-Techie-jt/spring-cloud-gatway-hystrix

-------------------------------------------------------------------------
THERE IS LIST OF SEPARATED VIDEOS RELATED TO THE SAME COURSE:

1. Microservice | Spring Cloud Eureka + API Gateway + Spring Cloud Hystrix | PART-1 | Javatechie
https://www.youtube.com/watch?v=2BcmN6TG_No&list=PLVz2XdJiJQxz3L2Onpxbel6r72IDdWrJh&index=19&t=362s&ab_channel=JavaTechie
ONLY 2 services - order and payment are created - with RestTemplate.
Ports: 9191 and 9192

2. Microservice | Spring Cloud Eureka + Gateway + Hystrix | PART-2 | Javatechie
    Added Eureka service - 8761 port
    Annotated RestTemplate method with @LoadBalanced!!!

3. Microservice | Spring Cloud Eureka + Gateway + Hystrix | PART-3 | Javatechie
    Add API Gateway - 8989 port
    Added findPaymentHistoryByOrderId method in

4. Microservice | Spring Cloud Eureka + Gateway + Hystrix | PART-4 | Javatechie
Add Hystrix - in case of service fault (errors) - stop requests and give fallback message
To visualise service use Hystrix Dashboard (CircuitBreaker in yml API Gateway + FallbackController)
15 MAY -
now Hystrix too is deprecated and no longer available with Boot 2.6.2.
Yes we need to migrate to resilience4J.


E:\000 2021\idea-microservices-techie
E:\000000\MICROSERVICES\idea-microservices-techie NEW

	\order-service
	\payment-service
	\service-registry
	\cloud gateway

-- Spring Boot" 2.3.0.RELEASE
-- Java 11
-- spring-cloud.version>Hoxton.SR5
-- Using H2 dbase - (initialize H2 instance on Spring Boot start with data inserts - data.sql) - 1 table per service
-- Using RestTemplate
-- Hystrix - 1st part

-- TransactionRequest
-- TransactionResponse

--     public TransactionResponse saveOrder(TransactionRequest request) 

H2 - use dbase from startup log Spring Boot
-----------------------------------------------
-- From log file - the H2 instance is created:
H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:e57153ea-4ad7-438f-bee6-182eae13ffa6'

-- There is no need to put dbase url for H2 conn - just this:
server.port=9192
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.jpa.show-sql=true
#spring.datasource.url=jdbc:h2:mem:testdb
#spring.datasource.username=sa
#spring.datasource.password=

localhost:9191/h2-console
localhost:9192/h2-console



Hystrix
-----------------------
API Gateway
Add dependency for Hystrix:
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-hystrix</artifactId>
        </dependency>

Write FallbackController
Add filters to application.yml:
          filters:
            - name: CircuitBreaker
              args:
                name: order-service
                fallbackuri: forward:/orderFallBack

          filters:
            - name: CircuitBreaker
              args:
                name: payment-service
                fallbackuri: forward:/paymentFallback
--------------------------------------------------- START ------------------
Start
1. Eureka Registry
2. Gateway
3. order
4. payment


POST
localhost:8989/order/bookOrder
REQUEST
{ 
    "order": {
        "id": 1,
        "name": "TV",
        "qty": 1,
        "price": 2500
    },
    "payment": {}
}

RESPONSE
{
    "order": {
        "id": 1,
        "name": "TV",
        "qty": 1,
        "price": 2500.0
    },
    "amount": 2500.0,
    "transactionId": "fa41aba7-0221-4c07-b7c3-2f12830b98aa",
    "message": "payment processing successful and order placed"
}

GET
localhost:8989/payment/2
Response
{
    "paymentId": 2,
    "paymentStatus": "success",
    "transactionId": "2f849aa1-e42c-4951-a1f4-24474dce2613",
    "orderId": 2,
    "amount": 999.0
}

Hystrix - not working on stopping services. It shows eror:     "status": 503,
                                                               "error": "Service Unavailable",

*****************  15 MAY -
now Hystrix too is deprecated and no longer available with Boot 2.6.2.
Yes we need to migrate to resilience4J.
