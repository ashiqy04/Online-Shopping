package com.project.onlineshopping.sos.entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "sales_order")

public class SalesOrder {
	
	public SalesOrder() {
		
	}

	public SalesOrder(Long orderId, Date orderDate, String orderDesc, Double totalPrice, Long customerId,
			List<OrderLineItem> orderLineItems) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderDesc = orderDesc;
		this.totalPrice = totalPrice;
		this.customerId = customerId;
		this.orderLineItems = orderLineItems;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long orderId;

	@Column(name = "order_date")
	private Date orderDate;

	@Column(name = "order_desc")
	private String orderDesc;

	@Column(name = "total_price")
	private Double totalPrice;

	private Long customerId;

	@OneToMany( mappedBy = "salesOrder", cascade = CascadeType.MERGE)
	private List<OrderLineItem> orderLineItems;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderDesc() {
		return orderDesc;
	}

	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public List<OrderLineItem> getOrderLineItems() {
		return orderLineItems;
		
	}

	
	public void setOrderLineItems(List<OrderLineItem> orderLineItems) {
		this.orderLineItems = orderLineItems;
		this.orderLineItems.forEach(orderLineItem -> orderLineItem.setSalesOrder(this));
		}


}
