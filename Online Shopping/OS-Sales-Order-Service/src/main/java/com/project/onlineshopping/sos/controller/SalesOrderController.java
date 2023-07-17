package com.project.onlineshopping.sos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.onlineshopping.sos.entity.SalesOrder;
import com.project.onlineshopping.sos.service.SalesOrderService;
import com.project.onlineshopping.sos.vo.ResponseTemplateVO;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/order")

public class SalesOrderController {
	
	@Autowired
	private SalesOrderService salesOrderService;
	
	private static final String SALES_ORDER = "salesOrder";
	
	@PostMapping("/orders")
	public SalesOrder saveSalesOrder(@RequestBody SalesOrder salesOrder) {
		return salesOrderService.saveSalesOrder(salesOrder);
	}
	
	
	@GetMapping("/")
	public List<SalesOrder> getAll() {
		return salesOrderService.getAll();
	}
	
	@GetMapping("/{id}")
	@CircuitBreaker(name = SALES_ORDER)
	public ResponseTemplateVO getOrderByCustomer(@PathVariable("id") Long customerId) {
		return salesOrderService.getOrderByCustomer(customerId);
	}
	
	

}
