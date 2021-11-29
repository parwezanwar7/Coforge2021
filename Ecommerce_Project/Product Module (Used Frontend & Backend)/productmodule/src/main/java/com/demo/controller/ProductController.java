package com.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.demo.pojo.Product;
import com.demo.service.ProductService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping(method=RequestMethod.GET, value="api/v1/products/{id}")
	public Product findProductById(@PathVariable int id) {
		return productService.getProductById(id);
	}
	@RequestMapping(method=RequestMethod.GET,value=("api/v1/products"))
	 public List<Product> getAllProducts(){
		 
		 return productService.getAllProducts();

}
	
	@RequestMapping(method=RequestMethod.POST,value=("api/v1/products"))
	public void addProduct(@RequestBody Product product)
	{
		productService.addProduct(product);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value=("api/v1/products/{id}"))
	public void updateProduct(@PathVariable Integer id,@RequestBody Product product)
	{
		productService.updateProduct(id,product);
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value=("api/v1/products/{id}"))
	public void DeleteProduct(@PathVariable Integer id)
	{
		productService.deleteProduct(id);
		
	}
}

