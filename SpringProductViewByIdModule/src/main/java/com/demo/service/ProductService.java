package com.demo.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.pojo.Product;
import com.demo.repositary.ProductRepositary;
import com.demo.controller.ProductController;

@Service
public class ProductService {
	
	@Autowired
	public ProductRepositary productRepo;
	
	public Product getProductById(int id) {
		return productRepo.findById(id).orElse(null);
		
		
		
}
	
	

}
