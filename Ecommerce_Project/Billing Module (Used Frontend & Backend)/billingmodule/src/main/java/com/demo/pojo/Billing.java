package com.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="billingtable")

public class Billing {
	
	@Id
	@GeneratedValue
	private Integer id;
	private Integer customerid;
	private String  type;
	private String description;
	private Integer number;
	private Integer receipt;
	public Billing() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Billing [id=" + id + ", customerid=" + customerid + ", type=" + type + ", description=" + description
				+ ", number=" + number + ", receipt=" + receipt + "]";
	}
	public Billing(Integer id, Integer customerid, String type, String description, Integer number, Integer receipt) {
		super();
		this.id = id;
		this.customerid = customerid;
		this.type = type;
		this.description = description;
		this.number = number;
		this.receipt = receipt;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Integer getReceipt() {
		return receipt;
	}
	public void setReceipt(Integer receipt) {
		this.receipt = receipt;
	}
}
	