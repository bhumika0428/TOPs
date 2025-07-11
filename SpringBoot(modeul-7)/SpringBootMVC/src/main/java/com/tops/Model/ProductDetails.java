package com.tops.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ProductDetails")
public class ProductDetails {
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
	@Override
	public String toString() {
		return "ProductDetails [productId=" + productId + ", productName=" + productName + ", Price=" + Price
				+ ", Description=" + Description + "]";
	}
	public ProductDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductDetails(int productId, String productName, String price, String description) {
		super();
		this.productId = productId;
		this.productName = productName;
		Price = price;
		Description = description;
	}
	
}
