package com.project.onlineshopping.customer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity 
@Table(name = "Customer")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Customer {
	
	public Customer() {
		
	}
	
	public Customer(Long customerId, String email, String first_name, String last_name) {
		super();
		this.customerId = customerId;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cust_id")
	private Long customerId;
	
	@Column(name = "cust_first_name")
	private String first_name;
	
	@Column(name = "cust_last_name")
	private String last_name;
	
	@Column(name = "cust_email")
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


	public void notify(String string) {
		
	}

}
