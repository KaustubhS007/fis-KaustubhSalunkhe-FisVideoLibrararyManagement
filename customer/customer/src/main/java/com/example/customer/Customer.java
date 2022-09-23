package com.example.customer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Customer")
public class Customer {

	@Id
	int cid;
	
	String movie_type;
	
	String customer_name;
	
	String contact_no;
	
	String contact_address;
	
	String date;
	
	int age;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int cid, String movie_type, String customer_name, String contact_no, String contact_address,
			String date, int age) {
		super();
		this.cid = cid;
		this.movie_type = movie_type;
		this.customer_name = customer_name;
		this.contact_no = contact_no;
		this.contact_address = contact_address;
		this.date = date;
		this.age = age;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getMovie_type() {
		return movie_type;
	}

	public void setMovie_type(String movie_type) {
		this.movie_type = movie_type;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public String getContact_address() {
		return contact_address;
	}

	public void setContact_address(String contact_address) {
		this.contact_address = contact_address;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	
	
	
}
