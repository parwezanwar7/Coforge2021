package com.demo.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.repositary.BillingRepositary;
import com.demo.pojo.Billing;

import com.demo.controller.BillingController;

@Service
public class BillingService {
	@Autowired
	public BillingRepositary billingRepo;
	 public List<Billing> getAllBillings(){
		 
		 List<Billing>billings=new ArrayList<>();
		 billingRepo.findAll().forEach(billings::add);
		 return billings; 

}
	 public void addBilling(Billing billing) {
		    billingRepo.save(billing);
	 }
	 public void updateBilling(Integer id,Billing billing) {
		    billingRepo.save(billing);
	 }
	 public void deleteBilling(Integer id) {
		    billingRepo.deleteById(id);
	 }
	 public Billing getBillingById(int id) {
			return billingRepo.findById(id).orElse(null);
			
			
			
	}
		
}






