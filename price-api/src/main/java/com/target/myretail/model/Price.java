package com.target.myretail.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Price {

	@JsonIgnore
	private int productId;
	
	public Price() {
		
	}

	public Price(int productId, double value, String currency_code) {
		super();
		this.productId = productId;
		this.value = value;
		this.currency_code = currency_code;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	private double value;
	private String currency_code;
	
	
	public Price(double value, String currency_code) {
		super();
		this.value = value;
		this.currency_code = currency_code;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
	public String getCurrency_code() {
		return currency_code;
	}
	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}
	
	@Override
	public String toString() {
		return "Price [value=" + value + ", currency_code=" + currency_code + "]";
	}
}
