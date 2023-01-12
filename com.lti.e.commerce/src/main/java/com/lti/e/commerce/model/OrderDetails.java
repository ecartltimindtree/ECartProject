package com.lti.e.commerce.model;

import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class OrderDetails {
	
	
	private int productOrderId;
	
	private int totalItems;
	
	
	@OneToOne
	@JoinColumn(name = "cartItemId")
	private CartItems cartItems;
	
	
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;
	
	
	// audit fields
	private String createdBy;
	private Date createdOn;
	private String modifiedBy;
	private Date modifiedOn;
	public int getProductOrderId() {
		return productOrderId;
	}
	public void setProductOrderId(int productOrderId) {
		this.productOrderId = productOrderId;
	}
	public int getTotalItems() {
		return totalItems;
	}
	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}
	public CartItems getCartItems() {
		return cartItems;
	}
	public void setCartItems(CartItems cartItems) {
		this.cartItems = cartItems;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDetails(int productOrderId, int totalItems, CartItems cartItems, User user, String createdBy,
			Date createdOn, String modifiedBy, Date modifiedOn) {
		super();
		this.productOrderId = productOrderId;
		this.totalItems = totalItems;
		this.cartItems = cartItems;
		this.user = user;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.modifiedBy = modifiedBy;
		this.modifiedOn = modifiedOn;
	}
	@Override
	public String toString() {
		return "OrderDetails [productOrderId=" + productOrderId + ", totalItems=" + totalItems + ", cartItems="
				+ cartItems + ", user=" + user + ", createdBy=" + createdBy + ", createdOn=" + createdOn
				+ ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn + "]";
	}
		

}
