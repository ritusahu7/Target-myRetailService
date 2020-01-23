package com.target.myretail.model;

public class Circle_Offers {

	

	  @Override
	public String toString() {
		return "Circle_Offers [universal_offer_exists=" + universal_offer_exists + ", non_universal_offer_exists="
				+ non_universal_offer_exists + "]";
	}

	private boolean universal_offer_exists;
	  private boolean non_universal_offer_exists;


	 // Getter Methods 

	  public boolean getUniversal_offer_exists() {
	    return universal_offer_exists;
	  }

	  public boolean getNon_universal_offer_exists() {
	    return non_universal_offer_exists;
	  }

	 // Setter Methods 

	  public void setUniversal_offer_exists( boolean universal_offer_exists ) {
	    this.universal_offer_exists = universal_offer_exists;
	  }

	  public void setNon_universal_offer_exists( boolean non_universal_offer_exists ) {
	    this.non_universal_offer_exists = non_universal_offer_exists;
	  }
	
}
