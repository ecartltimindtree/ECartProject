package com.lti.e.commerce.model;

import java.util.Date;

public class ProductInventory {
	
	private int productInventoryId;
	private int quatity;
	
	// audit fields
	private String createdBy;
	private Date createdOn;
	private String modifiedBy;
	private Date modifiedOn;
	public int getProductInventoryId() {
		return productInventoryId;
	}
	public void setProductInventoryId(int productInventoryId) {
		this.productInventoryId = productInventoryId;
	}
	public int getQuatity() {
		return quatity;
	}
	public void setQuatity(int quatity) {
		this.quatity = quatity;
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
	public ProductInventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductInventory(int productInventoryId, int quatity, String createdBy, Date createdOn, String modifiedBy,
			Date modifiedOn) {
		super();
		this.productInventoryId = productInventoryId;
		this.quatity = quatity;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.modifiedBy = modifiedBy;
		this.modifiedOn = modifiedOn;
	}
	@Override
	public String toString() {
		return "ProductInventory [productInventoryId=" + productInventoryId + ", quatity=" + quatity + ", createdBy="
				+ createdBy + ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn
				+ "]";
	}
	
	
	
	
	}
