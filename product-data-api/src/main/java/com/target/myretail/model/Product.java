package com.target.myretail.model;

public class Product {
	  Available_to_promise_network available_to_promise_network;
	  Item item;
	  Circle_Offers circle_offers;


	 // Getter Methods 

	  public Available_to_promise_network getAvailable_to_promise_network() {
	    return available_to_promise_network;
	  }

	  public Item getItem() {
	    return item;
	  }

	  public Circle_Offers getCircle_offers() {
	    return circle_offers;
	  }

	 // Setter Methods 

	  public void setAvailable_to_promise_network( Available_to_promise_network available_to_promise_networkObject ) {
	    this.available_to_promise_network = available_to_promise_networkObject;
	  }

	  public void setItem( Item itemObject ) {
	    this.item = itemObject;
	  }

	  public void setCircle_offers( Circle_Offers circle_offersObject ) {
	    this.circle_offers = circle_offersObject;
	  }
	}
	
	