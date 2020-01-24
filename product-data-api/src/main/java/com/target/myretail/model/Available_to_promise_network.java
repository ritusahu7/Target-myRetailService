package com.target.myretail.model;

import java.util.ArrayList;

public class Available_to_promise_network {
	  private String product_id;
	  private String id_type;
	  private float available_to_promise_quantity;
	  private String street_date;
	  private String availability;
	  private float online_available_to_promise_quantity;
	  private float stores_available_to_promise_quantity;
	  private String availability_status;
	  ArrayList<Object> multichannel_options = new ArrayList<Object>();
	  private boolean is_infinite_inventory;
	  private String loyalty_availability_status;
	  private String loyalty_purchase_start_date_time;
	  private boolean is_loyalty_purchase_enabled;
	  private boolean is_out_of_stock_in_all_store_locations;
	  private boolean is_out_of_stock_in_all_online_locations;


	 // Getter Methods 

	  public String getProduct_id() {
	    return product_id;
	  }

	  public String getId_type() {
	    return id_type;
	  }

	  public float getAvailable_to_promise_quantity() {
	    return available_to_promise_quantity;
	  }

	  public String getStreet_date() {
	    return street_date;
	  }

	  public String getAvailability() {
	    return availability;
	  }

	  public float getOnline_available_to_promise_quantity() {
	    return online_available_to_promise_quantity;
	  }

	  public float getStores_available_to_promise_quantity() {
	    return stores_available_to_promise_quantity;
	  }

	  public String getAvailability_status() {
	    return availability_status;
	  }

	  public boolean getIs_infinite_inventory() {
	    return is_infinite_inventory;
	  }

	  public String getLoyalty_availability_status() {
	    return loyalty_availability_status;
	  }

	  public String getLoyalty_purchase_start_date_time() {
	    return loyalty_purchase_start_date_time;
	  }

	  public boolean getIs_loyalty_purchase_enabled() {
	    return is_loyalty_purchase_enabled;
	  }

	  public boolean getIs_out_of_stock_in_all_store_locations() {
	    return is_out_of_stock_in_all_store_locations;
	  }

	  public boolean getIs_out_of_stock_in_all_online_locations() {
	    return is_out_of_stock_in_all_online_locations;
	  }

	 // Setter Methods 

	  public void setProduct_id( String product_id ) {
	    this.product_id = product_id;
	  }

	  public void setId_type( String id_type ) {
	    this.id_type = id_type;
	  }

	  public void setAvailable_to_promise_quantity( float available_to_promise_quantity ) {
	    this.available_to_promise_quantity = available_to_promise_quantity;
	  }

	  public void setStreet_date( String street_date ) {
	    this.street_date = street_date;
	  }

	  public void setAvailability( String availability ) {
	    this.availability = availability;
	  }

	  public void setOnline_available_to_promise_quantity( float online_available_to_promise_quantity ) {
	    this.online_available_to_promise_quantity = online_available_to_promise_quantity;
	  }

	  public void setStores_available_to_promise_quantity( float stores_available_to_promise_quantity ) {
	    this.stores_available_to_promise_quantity = stores_available_to_promise_quantity;
	  }

	  public void setAvailability_status( String availability_status ) {
	    this.availability_status = availability_status;
	  }

	  public void setIs_infinite_inventory( boolean is_infinite_inventory ) {
	    this.is_infinite_inventory = is_infinite_inventory;
	  }

	  public void setLoyalty_availability_status( String loyalty_availability_status ) {
	    this.loyalty_availability_status = loyalty_availability_status;
	  }

	  public void setLoyalty_purchase_start_date_time( String loyalty_purchase_start_date_time ) {
	    this.loyalty_purchase_start_date_time = loyalty_purchase_start_date_time;
	  }

	  public void setIs_loyalty_purchase_enabled( boolean is_loyalty_purchase_enabled ) {
	    this.is_loyalty_purchase_enabled = is_loyalty_purchase_enabled;
	  }

	  public void setIs_out_of_stock_in_all_store_locations( boolean is_out_of_stock_in_all_store_locations ) {
	    this.is_out_of_stock_in_all_store_locations = is_out_of_stock_in_all_store_locations;
	  }

	  public void setIs_out_of_stock_in_all_online_locations( boolean is_out_of_stock_in_all_online_locations ) {
	    this.is_out_of_stock_in_all_online_locations = is_out_of_stock_in_all_online_locations;
	  }

	@Override
	public String toString() {
		return "Available_to_promise_network [product_id=" + product_id + ", id_type=" + id_type
				+ ", available_to_promise_quantity=" + available_to_promise_quantity + ", street_date=" + street_date
				+ ", availability=" + availability + ", online_available_to_promise_quantity="
				+ online_available_to_promise_quantity + ", stores_available_to_promise_quantity="
				+ stores_available_to_promise_quantity + ", availability_status=" + availability_status
				+ ", multichannel_options=" + multichannel_options + ", is_infinite_inventory=" + is_infinite_inventory
				+ ", loyalty_availability_status=" + loyalty_availability_status + ", loyalty_purchase_start_date_time="
				+ loyalty_purchase_start_date_time + ", is_loyalty_purchase_enabled=" + is_loyalty_purchase_enabled
				+ ", is_out_of_stock_in_all_store_locations=" + is_out_of_stock_in_all_store_locations
				+ ", is_out_of_stock_in_all_online_locations=" + is_out_of_stock_in_all_online_locations + "]";
	}
	}
