//There is Zuul as well.
// But Zuul does not support non-blocking API
// https://blog.knoldus.com/differences-netflix-zuul-and-spring-cloud-gateway/#:~:text=Zuul%20is%20a%20JVM%2Dbased,and%20authentication%20for%20each%20one.
/* Netflix Zuul
 Zuul is a JVM-based router and server-side load balancer from Netflix.
 It provides a single entry to our system, which allows a browser, mobile app, or other user interface
 to consume services from multiple hosts without managing cross-origin resource sharing (CORS) and authentication for each one.

 <dependency>
   <groupId>org.springframework.cloud</groupId>
   <artifactId>spring-cloud-starter-netflix-zuul</artifactId>
</dependency>



Spring Cloud Gateway
Just like Zuul , Spring Cloud Gateway provides means for routing requests to different services.
Spring Cloud Gateway aims to provide a simple, yet effective way to route to APIs and
provide cross cutting concerns to them such as: security, monitoring/metrics, and resiliency.

<dependency>
   <groupId>org.springframework.cloud</groupId>
   <artifactId>spring-cloud-starter-gateway</artifactId>
</dependency>
*/
