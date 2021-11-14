package com.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import com.demo.pojo.Product;



public interface ProductService{
	
	Product CreatProductDetails(Product product); //done
	
	
		// list of all products

		ArrayList<Product> ListOfProducts(Product product); 

		// Delete of Product

		void deleteProductById(long id); 

		// view of particular Product by id

	     Optional<Product> getProductById(long id);  

		// update of particular Product by id

		void updateOfProductById(long id); 
	
}
	


