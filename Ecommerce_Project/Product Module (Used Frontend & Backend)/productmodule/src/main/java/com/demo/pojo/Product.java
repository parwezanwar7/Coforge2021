package com.demo.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

// adding the association in pojo

@Entity
@Table(name = "producttable")
public class Product {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String category;
	private String description;
	private String manufacturer;
	private String name;
	private long unit;
	                                     @Override
	public String toString() {
		return "Product [id=" + id + ", category=" + category + ", description=" + description + ", manufacturer="
				+ manufacturer + ", name=" + name + ", unit=" + unit + "]";
	}
										public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
										public Product(Integer id, String category, String description, String manufacturer, String name, long unit) {
		super();
		this.id = id;
		this.category = category;
		this.description = description;
		this.manufacturer = manufacturer;
		this.name = name;
		this.unit = unit;
	}
										{
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getUnit() {
		return unit;
	}
	public void setUnit(long unit) {
		this.unit = unit;
	}
}
	