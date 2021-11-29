package com.demo.repositary;

import org.springframework.data.repository.CrudRepository;

import com.demo.pojo.Customer;
import com.demo.service.CustomerService;
import com.demo.controller.CustomerController;

public interface CustomerRepositary extends CrudRepository<Customer,Integer> {

}
