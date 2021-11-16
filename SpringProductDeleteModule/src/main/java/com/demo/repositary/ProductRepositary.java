package com.demo.repositary;

import org.springframework.data.repository.CrudRepository;

import com.demo.pojo.Product;
import com.demo.controller.ProductController;
import com.demo.service.ProductService;

public interface ProductRepositary extends CrudRepository<Product,Long> {
	
	
	

}
