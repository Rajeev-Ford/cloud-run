package com.ford.qed.cdr.qedcdraso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class QedCdrAsoApplication {

	public static void main(String[] args) {
		SpringApplication.run(QedCdrAsoApplication.class, args);
	}

	@GetMapping("/hello")
	public String helloFord(){
		return "Hello Ford";
	}


}
