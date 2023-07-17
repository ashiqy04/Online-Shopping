package com.project.onlineshopping.sos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.onlineshopping.sos.entity.SalesOrder;


public interface SalesOrderRepository extends JpaRepository<SalesOrder, Long> {
	
	SalesOrder findByOrderId(Long orderId);

	SalesOrder findByCustomerId(Long customerId);




}
