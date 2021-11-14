package com.demo.controlller; // this is our controller class which control all the classes

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.Product;
import com.demo.serviceImpl.ProductServiceImpl;


@RestController
@RequestMapping("/vi/api") 
public class ProductController {

	@Autowired // it is used to autowire below line. we do not have to write setter and getter method for below line 
	ProductServiceImpl productServiceImpl;

	@PostMapping("/createproduct")
	Product createProductDetails(@RequestBody Product productinfo) {

		Product prodinfo = productServiceImpl.CreatProductDetails(productinfo);
		System.out.println("hello springboot"+prodinfo.getId());// written for more understanding

		return prodinfo;

	}

}
