package com.project.onlineshopping.customer.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.onlineshopping.customer.entity.Customer;
import com.project.onlineshopping.customer.response.CustomerResponseHandler;
import com.project.onlineshopping.customer.service.CustomerService;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/customer-service")
@Slf4j
public class CustomerController {
	
	Logger logger = LoggerFactory.getLogger(CustomerController.class);	
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping(value = "/customer")
    public ResponseEntity<Object> Post(@RequestBody Customer customer){
        try {
        	Customer result = customerService.createCustomer(customer);
        	logger.info("Adding a customer:" + customer);
            return CustomerResponseHandler.generateResponse("Customer Created", HttpStatus.OK, result);
        } catch (Exception e) {

            return CustomerResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }

    }	
	
	@GetMapping("/customer{id}")
	public Customer findCustomerById(@PathVariable("id") Long customerId){
		logger.info("Fetching a customer of ID:" + customerId);
		return customerService.findCustomerById(customerId);
	}

	
	@GetMapping("/customers")
	public List<Customer> findAllCustomer() {
		logger.info("Fetching all customers");
		return customerService.findAllCustomer();
	}
	

}
