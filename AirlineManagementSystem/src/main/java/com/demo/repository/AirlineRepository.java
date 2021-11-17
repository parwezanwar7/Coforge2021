package com.demo.repository;
import org.springframework.data.repository.CrudRepository;

import com.demo.pojo.Airline;
public interface AirlineRepository extends CrudRepository<Airline, Integer>
{
}
