package com.azuretech.azurespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@@RestController
public class AzureSpringbootApplication {
	
	GetMapping("/message")
	public String message(){
		return "this is the forst commit....";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureSpringbootApplication.class, args);
	}

}
