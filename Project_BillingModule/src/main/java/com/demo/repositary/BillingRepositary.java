package com.demo.repositary;

import org.springframework.data.repository.CrudRepository;

import com.demo.pojo.Billing;
import com.demo.service.BillingService;
import com.demo.controller.BillingController;

public interface BillingRepositary extends CrudRepository<Billing,Integer> {

}