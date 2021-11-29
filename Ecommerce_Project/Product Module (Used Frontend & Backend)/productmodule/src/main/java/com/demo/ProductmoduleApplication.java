package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import com.demo.repositary.ProductRepositary;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.pojo.Product;
import com.demo.repositary.ProductRepositary;

@SpringBootApplication
public class ProductmoduleApplication  {

	public static void main(String[] args) {
		SpringApplication.run(ProductmoduleApplication.class, args);
	}
	
	
}
