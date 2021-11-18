package com.demo.controller;

import com.demo.pojo.Customer;

import com.demo.service.CustomerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(method=RequestMethod.GET,value=("/customers"))
	 public List<Customer> getAllCustomers(){
		 
		 return customerService.getAllCustomers();

}
	
	@RequestMapping(method=RequestMethod.POST,value=("/customers/add"))
	public void addCustomer(@RequestBody Customer customer)
	{
		customerService.addCustomer(customer);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value=("/customers/{id}"))
	public void updateCustomer(@PathVariable Integer id,@RequestBody Customer customer)
	{
		customerService.updateCustomer(id,customer);
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value=("/customers/{id}"))
	public void DeleteCustomer(@PathVariable Integer id)
	{
		customerService.deleteCustomer(id);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/customers/{id}")
	public Customer findCustomerById(@PathVariable int id) {
		return customerService.getCustomerById(id);
	}
	
	 
	 
	
}
