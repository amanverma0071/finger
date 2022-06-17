package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(title="Finger Api",version="2.0",description="Finger microservice"))
public class FingerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FingerApplication.class, args);
	}

}
