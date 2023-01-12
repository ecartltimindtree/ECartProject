package com.lti.e.commerce.model;

import java.util.Date;

public class ProductCategories {
	
	
	private int productCategoryId;
	private String productCategoryName;
	private String description;
	
	// audit fields
	private String createdBy;
	private Date createdOn;
	private String modifiedBy;
	private Date modifiedOn;
	public int getProductCategoryId() {
		return productCategoryId;
	}
	public void setProductCategoryId(int productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	public String getProductCategoryName() {
		return productCategoryName;
	}
	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public ProductCategories() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductCategories(int productCategoryId, String productCategoryName, String description, String createdBy,
			Date createdOn, String modifiedBy, Date modifiedOn) {
		super();
		this.productCategoryId = productCategoryId;
		this.productCategoryName = productCategoryName;
		this.description = description;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.modifiedBy = modifiedBy;
		this.modifiedOn = modifiedOn;
	}
	@Override
	public String toString() {
		return "ProductCategories [productCategoryId=" + productCategoryId + ", productCategoryName="
				+ productCategoryName + ", description=" + description + ", createdBy=" + createdBy + ", createdOn="
				+ createdOn + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn + "]";
	}
	
	
	
	
}
