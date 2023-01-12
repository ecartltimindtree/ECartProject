package com.lti.e.commerce.model;

import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


/*
 * @uthor Pratik
*/

public class Products {
	
	private int productId;
	private String productName;
	private String description;
		
	private double price;
	
	// audit fields
	private String createdBy;
	private Date createdOn;
	private String modifiedBy;
	private Date modifiedOn;
		
	
	@ManyToOne
	@JoinColumn(name = "productCategoryId")
	private ProductCategories productCategories;
	

	@OneToOne
	@JoinColumn(name = "productInventoryId")
	private ProductInventory productInventory;


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
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


	public ProductCategories getProductCategories() {
		return productCategories;
	}


	public void setProductCategories(ProductCategories productCategories) {
		this.productCategories = productCategories;
	}


	public ProductInventory getProductInventory() {
		return productInventory;
	}


	public void setProductInventory(ProductInventory productInventory) {
		this.productInventory = productInventory;
	}


	public Products(int productId, String productName, String description, double price, String createdBy,
			Date createdOn, String modifiedBy, Date modifiedOn, ProductCategories productCategories,
			ProductInventory productInventory) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.modifiedBy = modifiedBy;
		this.modifiedOn = modifiedOn;
		this.productCategories = productCategories;
		this.productInventory = productInventory;
	}


	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", description=" + description
				+ ", price=" + price + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", modifiedBy="
				+ modifiedBy + ", modifiedOn=" + modifiedOn + ", productCategories=" + productCategories
				+ ", productInventory=" + productInventory + "]";
	}
	
	
	
}
