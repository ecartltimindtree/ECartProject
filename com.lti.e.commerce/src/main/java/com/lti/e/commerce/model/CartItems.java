package com.lti.e.commerce.model;

import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class CartItems {
	
	
	private int cartItemId;
	
	@ManyToOne
	@JoinColumn(name = "productId")
	private Products products;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;
	
	private int quantity;
	private double totalValue;
	
	
	// audit fields
	private int createdBy;
	private Date createdOn;
	private int modifiedBy;
	private Date modifiedOn;
	public int getCartItemId() {
		return cartItemId;
	}
	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}
	public Products getProducts() {
		return products;
	}
	public void setProducts(Products products) {
		this.products = products;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public int getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(int modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	public CartItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartItems(int cartItemId, Products products, User user, int quantity, double totalValue, int createdBy,
			Date createdOn, int modifiedBy, Date modifiedOn) {
		super();
		this.cartItemId = cartItemId;
		this.products = products;
		this.user = user;
		this.quantity = quantity;
		this.totalValue = totalValue;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.modifiedBy = modifiedBy;
		this.modifiedOn = modifiedOn;
	}
	
	@Override
	public String toString() {
		return "CartItems [cartItemId=" + cartItemId + ", products=" + products + ", user=" + user + ", quantity="
				+ quantity + ", totalValue=" + totalValue + ", createdBy=" + createdBy + ", createdOn=" + createdOn
				+ ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn + "]";
	}
		
	

}
