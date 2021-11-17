package com.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.Airline;
import com.demo.service.AirlineService;

//mark class as Controller
@RestController

public class AirlineController 
{

//autowire the AirlineService class
@Autowired
AirlineService airlineService;

//creating a get mapping that retrieves all the airline detail from the database 
@GetMapping("/SearchAll")
private List<Airline> getAllAirline() 
{
return airlineService.getAllAirline();
}

//creating a get mapping that retrieves the detail of a specific airline
@GetMapping("/SearchSpecific/{PnrNumber}")
private Airline getPnrNumber(@PathVariable("PnrNumber") int PnrNumber) 
{
return airlineService.getPnrNumber(PnrNumber);
}

//creating a delete mapping that deletes a specified airline
@DeleteMapping("/Cancel/{PnrNumber}")
private void deleteAirline(@PathVariable("PnrNumber") int PnrNumber) 
{
airlineService.delete(PnrNumber);
}

//creating post mapping that post the airline detail in the database
@PostMapping("/Book")
private int saveAirline(@RequestBody Airline airline) 
{
airlineService.saveOrUpdate(airline);
return airline.getPnrNumber();
}

//creating put mapping that updates the Airline detail 
@PutMapping("/Modify")
private Airline update(@RequestBody Airline airline) 
{
airlineService.saveOrUpdate(airline);
return airline;
}
}
