package com.demo.pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
//mark class as an Entity 
@Entity
@Table(name = "airline")
public class Airline
{

//Defining PnrNumber id as primary key
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@NotEmpty
@Column(name="PnrNumber")
private int PnrNumber;


@JsonFormat
@NotBlank
@NotNull
@Size(min = 10, max =100)
@Column(length = 255 )
private String PassengerName;

@JsonFormat
@NotBlank
@NotNull
@Size(min = 10, max =100)
@Column(length = 255 )
private String FlightName;

@NotEmpty
@Column(name="price")
private int price;


public int getPnrNumber() {
	return PnrNumber;
}
public void setPnrNumber(int pnrNumber) {
	PnrNumber = pnrNumber;
}
public String getPassengerName() {
	return PassengerName;
}
public void setPassengerName(String passengerName) {
	PassengerName = passengerName;
}
public String getFlightName() {
	return FlightName;
}
public void setFlightName(String flightName) {
	FlightName = flightName;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}