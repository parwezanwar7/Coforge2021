package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.Product;
import com.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@PutMapping("/update")
	Product updateProductDetails(@RequestBody Product productinfo) {

		Product prodinfo = productService.updateProductDetails(productinfo);

		return prodinfo;

	}

}
