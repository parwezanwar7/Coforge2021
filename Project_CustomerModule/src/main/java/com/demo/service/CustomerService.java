package com.demo.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.repositary.CustomerRepositary;
import com.demo.pojo.Customer;

import com.demo.controller.CustomerController;

@Service
public class CustomerService {
	@Autowired
	public CustomerRepositary customerRepo;
	 public List<Customer> getAllCustomers(){
		 
		 List<Customer>customers=new ArrayList<>();
		 customerRepo.findAll().forEach(customers::add);
		 return customers; 

}
	 public void addCustomer(Customer customer) {
		    customerRepo.save(customer);
	 }
	 public void updateCustomer(Integer id,Customer customer) {
		    customerRepo.save(customer);
	 }
	 public void deleteCustomer(Integer id) {
		    customerRepo.deleteById(id);
	 }
	 public Customer getCustomerById(int id) {
			return customerRepo.findById(id).orElse(null);
			
			
			
	}
		
}
