package com.project.onlineshopping.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.onlineshopping.customer.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {


	Customer findByCustomerId(Long customerId);


}
