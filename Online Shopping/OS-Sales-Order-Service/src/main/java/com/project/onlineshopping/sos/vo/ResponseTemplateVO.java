package com.project.onlineshopping.sos.vo;

import com.project.onlineshopping.sos.entity.OrderLineItem;
import com.project.onlineshopping.sos.entity.SalesOrder;

public class ResponseTemplateVO {
	
	public ResponseTemplateVO() {

	}
	
	public ResponseTemplateVO(SalesOrder salesOrder, Customer customer, OrderLineItem orderLineItem) {
		super();
		this.salesOrder = salesOrder;
		this.customer = customer;
		this.orderLineItem = orderLineItem;
	}
	

	private SalesOrder salesOrder;
	private Customer customer;
	private OrderLineItem orderLineItem;
	
	public SalesOrder getSalesOrder() {
		return salesOrder;
	}
	public void setSalesOrder(SalesOrder salesOrder) {
		this.salesOrder = salesOrder;
	}
	
	/*public Customer getCustomer() {
		return customer;
	}*/
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public void setOrderLineItem(OrderLineItem orderLineItem) {
		this.orderLineItem = orderLineItem;
	}
	
	
}
