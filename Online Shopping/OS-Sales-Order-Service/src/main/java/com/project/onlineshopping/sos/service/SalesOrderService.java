package com.project.onlineshopping.sos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.onlineshopping.sos.entity.SalesOrder;
import com.project.onlineshopping.sos.repository.SalesOrderRepository;
import com.project.onlineshopping.sos.vo.Customer;
import com.project.onlineshopping.sos.vo.ResponseTemplateVO;


@Service
public class SalesOrderService {
	
	@Autowired
	private SalesOrderRepository salesOrderRepository;

	@Autowired
	private RestTemplate restTemplate;
	
	public SalesOrder saveSalesOrder(SalesOrder salesOrder) {
		return salesOrderRepository.save(salesOrder);
	}


	public ResponseTemplateVO getOrderByCustomer(Long customerId) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		SalesOrder salesOrder = salesOrderRepository.findByCustomerId(customerId);
		Customer customer = 
				restTemplate.getForObject("http://CUSTOMER-SERVICE/customer-service/customer" + salesOrder.getCustomerId(),
								Customer.class);
		vo.setSalesOrder(salesOrder);
		vo.setCustomer(customer);
		return vo;
	}


	public List<SalesOrder> getAll() {
		return salesOrderRepository.findAll();
	}


}
