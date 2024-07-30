package com.techefx.microservices.springcloudapigatewayservice.techefxspringcloudapigatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TechefxSpringCloudApiGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechefxSpringCloudApiGatewayServiceApplication.class, args);
	}
	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {

		return builder.routes()
				.route(r -> r.path("/product-enquiry/**")
						.uri("http://localhost:8700/")
						.id("stock-enquiry")
				).build();
	}
}
