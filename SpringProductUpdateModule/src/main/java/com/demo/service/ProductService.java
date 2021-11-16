package com.demo.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.pojo.Product;
import com.demo.repositary.ProductRepositary;
import com.demo.controller.ProductController;
import com.demo.pojo.Product;

@Service
public class ProductService{
	@Autowired
	public ProductRepositary productRepo;
	public Product updateProductDetails(Product product) {

		Product existingProduct=productRepo.findById(product.getId()).orElse(null);
		existingProduct.setId(product.getId());
		existingProduct.setCategory(product.getCategory());
		existingProduct.setDescription(product.getDescription());
		existingProduct.setManufacturer(product.getManufacturer());
		existingProduct.setName(product.getName());
		existingProduct.setUnit(product.getUnit());
		
		return productRepo.save(existingProduct);
	}
}