package com.tops.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class productinfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	private String productName;
	private String Price;
	private String Description;
	
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
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	protected productinfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected productinfo(int productId, String productName, String price, String description) {
		super();
		this.productId = productId;
		this.productName = productName;
		Price = price;
		Description = description;
	}
	@Override
	public String toString() {
		return "productinfo [productId=" + productId + ", productName=" + productName + ", Price=" + Price
				+ ", Description=" + Description + "]";
	}
	
	
	
}
