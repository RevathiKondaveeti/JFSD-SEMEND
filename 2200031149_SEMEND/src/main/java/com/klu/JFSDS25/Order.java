package com.klu.JFSDS25;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders") // Avoid reserved keyword

public class Order {
	
	public Order(int id, String name, String date, String cusname) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.cusname = cusname;
	}
	public Order() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	@Id
	int id;
	String name;
	String date;
	String cusname;
	
	

}
