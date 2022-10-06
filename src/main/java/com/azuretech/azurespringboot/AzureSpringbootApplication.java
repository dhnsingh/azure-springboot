package com.azuretech.azurespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureSpringbootApplication {
	
	@GetMapping("/message")
	public String message(){
		return "this is the first commit....  ! Congrats";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureSpringbootApplication.class, args);
	}

}
 
