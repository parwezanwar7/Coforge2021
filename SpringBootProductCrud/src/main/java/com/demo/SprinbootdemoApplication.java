package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SprinbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinbootdemoApplication.class, args); // it will collect all classes and send to spring container for scanning and then spring container runs it
	}

}
