package com.target.myretail.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductResponse {
	
	private String id;
	private String name;
	@JsonProperty("current_price")
	private Price current_price;
	
	@JsonProperty("current_price")
	public Price getPrice() {
		return current_price;
	}

	@JsonProperty("current_price")
	public void setPrice(Price price) {
		this.current_price = price;
	}

	public ProductResponse() {
		
	}
	
	public ProductResponse(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String string) {
		this.id = string;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	
	

}
