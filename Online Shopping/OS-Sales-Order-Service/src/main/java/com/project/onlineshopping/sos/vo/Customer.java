package com.project.onlineshopping.sos.vo;

public class Customer {
	
	public Customer() {
		
	}
	
	public Customer(Long customerId, String first_name, String last_name, String email) {
		super();
		this.customerId = customerId;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}
	
	private Long customerId;
	private String first_name;
	private String last_name;
	private String email;
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
