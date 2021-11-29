package com.demo.controller;
import com.demo.pojo.Billing;

import com.demo.service.BillingService;
import com.demo.repositary.BillingRepositary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BillingController {
	@Autowired
	private BillingService billingService;
	
	@RequestMapping(method=RequestMethod.GET,value=("api/v1/billings"))
	 public List<Billing> getAllBillings(){
		 
		 return billingService.getAllBillings();

}
	
	@RequestMapping(method=RequestMethod.POST,value=("api/v1/billings"))
	public void addBilling(@RequestBody Billing billing)
	{
		billingService.addBilling(billing);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value=("api/v1/billings/{id}"))
	public void updateBilling(@PathVariable Integer id,@RequestBody Billing billing)
	{
		billingService.updateBilling(id,billing);
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value=("api/v1/billings/{id}"))
	public void DeleteBilling(@PathVariable Integer id)
	{
		billingService.deleteBilling(id);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value=("api/v1/billings/{id}"))
	public Billing findBillingById(@PathVariable int id) {
		return billingService.getBillingById(id);
	}
	
	 
	 
	
}
