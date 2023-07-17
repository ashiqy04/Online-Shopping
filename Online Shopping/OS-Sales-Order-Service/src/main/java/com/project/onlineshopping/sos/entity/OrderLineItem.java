package com.project.onlineshopping.sos.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_line_item")
public class OrderLineItem {	

	public OrderLineItem() {
		super();
	}


	public OrderLineItem(Long id, String itemName, Long itemQuantity, SalesOrder salesOrder) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
		this.salesOrder = salesOrder;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String itemName;
	
	private Long itemQuantity;
	
	
	@ManyToOne
	@JoinColumn(name = "orderId", referencedColumnName = "id")
	private SalesOrder salesOrder;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public Long getItemQuantity() {
		return itemQuantity;
	}


	public void setItemQuantity(Long itemQuantity) {
		this.itemQuantity = itemQuantity;
	}


	/*public SalesOrder getSalesOrder() {
		return salesOrder;
	}*/


	public void setSalesOrder(SalesOrder salesOrder) {
		this.salesOrder = salesOrder;
		
	}


}
	