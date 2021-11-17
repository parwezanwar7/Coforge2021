package com.demo.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.pojo.Airline;
import com.demo.repository.AirlineRepository;

//defining the business logic
@Service
public class AirlineService 
{

@Autowired
AirlineRepository airlineRepository;

//getting all Airline record by using the method findaAll() of CrudRepository
public List<Airline> getAllAirline() 
{
List<Airline> airline = new ArrayList<Airline>();
airlineRepository.findAll().forEach(airline1 -> airline.add(airline1));
return airline;
}

//getting a specific record by using the method findById() of CrudRepository
public Airline getPnrNumber(int PnrNumber) 
{
return airlineRepository.findById(PnrNumber).get();
}

//saving a specific record by using the method save() of CrudRepository
public void saveOrUpdate(Airline airline) 
{
airlineRepository.save(airline);
}

//deleting a specific record by using the method deleteById() of CrudRepository
public void delete(int PnrNumber) 
{
airlineRepository.deleteById(PnrNumber);
}

//updating a record
public void update(Airline airline, int PnrNumber) 
{
airlineRepository.save(airline);
}
}