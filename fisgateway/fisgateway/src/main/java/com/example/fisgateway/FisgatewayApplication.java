package com.example.fisgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FisgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(FisgatewayApplication.class, args);
	}

}
