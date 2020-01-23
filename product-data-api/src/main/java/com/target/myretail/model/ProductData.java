package com.target.myretail.model;

public class ProductData {
	  Available_to_promise_network Available_to_promise_networkObject;
	  Item ItemObject;
	  Circle_Offers Circle_offersObject;


	 // Getter Methods 

	  public Available_to_promise_network getAvailable_to_promise_network() {
	    return Available_to_promise_networkObject;
	  }

	  public Item getItem() {
	    return ItemObject;
	  }

	  public Circle_Offers getCircle_offers() {
	    return Circle_offersObject;
	  }

	 // Setter Methods 

	  public void setAvailable_to_promise_network( Available_to_promise_network available_to_promise_networkObject ) {
	    this.Available_to_promise_networkObject = available_to_promise_networkObject;
	  }

	  public void setItem( Item itemObject ) {
	    this.ItemObject = itemObject;
	  }

	  public void setCircle_offers( Circle_Offers circle_offersObject ) {
	    this.Circle_offersObject = circle_offersObject;
	  }
	}
	
	