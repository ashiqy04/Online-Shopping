package com.project.onlineshopping.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlineshopping.customer.entity.Customer;
import com.project.onlineshopping.customer.repository.CustomerRepository;


@Service
public class CustomerService {
	
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	public Customer createCustomer(Customer customer){
		return customerRepository.save(customer);
	}
	
		
	
	public Customer findCustomerById(Long customerId){

		return customerRepository.findByCustomerId(customerId);
	}



	public List<Customer> findAllCustomer(){
		return customerRepository.findAll();
	}


}
