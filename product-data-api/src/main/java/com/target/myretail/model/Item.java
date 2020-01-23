package com.target.myretail.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/*public class Item {

	private int tcin;
	private String[] bundle_components;
	private String dpci;
	private int upc;
	private Product_Description product_description;

	private String buy_url;
	private Enrichment enrichment;
	private String return_method;
	private String[] handling;
	private HashMap<String, Boolean> recall_compliance;
	private Tax_Category tax_category;
	private HashMap<String, Boolean> display_option;
	private Fulfillment fulfillment;
	private Package_Dimention package_dimensions;
	private HashMap<String, Boolean> environmental_segmentation;
	private String[] manufacturer;
	private List<Vendors> product_vendors;
	private Product_Classification product_classification;

	private Product_Brand product_brand;
	private String item_state;
	private String[] specifications;
	private Attributes attributes;

	private String country_of_origin;
	private String relationship_type_code;
	private boolean subscription_eligible;
	private String[] ribbons;
	private String[] tags;
	private String ship_to_restriction;
	private String estore_item_status_code;
	private boolean is_proposition_65;
	private HashMap<String, String> return_policies;
	private boolean gifting_enabled;
	private HashMap<String, Boolean> packaging;



	public int getTcin() {
		return tcin;
	}

	public void setTcin(int tcin) {
		this.tcin = tcin;
	}

	public String[] getBundle_components() {
		return bundle_components;
	}

	public void setBundle_components(String[] bundle_components) {
		this.bundle_components = bundle_components;
	}

	public String getDpci() {
		return dpci;
	}

	public void setDpci(String dpci) {
		this.dpci = dpci;
	}

	public int getUpc() {
		return upc;
	}

	public void setUpc(int upc) {
		this.upc = upc;
	}

	public Product_Description getProduct_description() {
		return product_description;
	}

	public void setProduct_description(Product_Description product_description) {
		this.product_description = product_description;
	}

	public String getBuy_url() {
		return buy_url;
	}

	public void setBuy_url(String buy_url) {
		this.buy_url = buy_url;
	}

	public Enrichment getEnrichment() {
		return enrichment;
	}

	public void setEnrichment(Enrichment enrichment) {
		this.enrichment = enrichment;
	}

	public String getReturn_method() {
		return return_method;
	}

	public void setReturn_method(String return_method) {
		this.return_method = return_method;
	}

	public String[] getHandling() {
		return handling;
	}

	public void setHandling(String[] handling) {
		this.handling = handling;
	}

	public HashMap<String, Boolean> getRecall_compliance() {
		return recall_compliance;
	}

	public void setRecall_compliance(HashMap<String, Boolean> recall_compliance) {
		this.recall_compliance = recall_compliance;
	}

	public Tax_Category getTax_category() {
		return tax_category;
	}

	public void setTax_category(Tax_Category tax_category) {
		this.tax_category = tax_category;
	}

	public HashMap<String, Boolean> getDisplay_option() {
		return display_option;
	}

	public void setDisplay_option(HashMap<String, Boolean> display_option) {
		this.display_option = display_option;
	}

	public Fulfillment getFulfillment() {
		return fulfillment;
	}

	public void setFulfillment(Fulfillment fulfillment) {
		this.fulfillment = fulfillment;
	}

	public Package_Dimention getPackage_dimensions() {
		return package_dimensions;
	}

	public void setPackage_dimensions(Package_Dimention package_dimensions) {
		this.package_dimensions = package_dimensions;
	}

	public HashMap<String, Boolean> getEnvironmental_segmentation() {
		return environmental_segmentation;
	}

	public void setEnvironmental_segmentation(HashMap<String, Boolean> environmental_segmentation) {
		this.environmental_segmentation = environmental_segmentation;
	}

	public String[] getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String[] manufacturer) {
		this.manufacturer = manufacturer;
	}

	public List<Vendors> getProduct_vendors() {
		return product_vendors;
	}

	public void setProduct_vendors(List<Vendors> product_vendors) {
		this.product_vendors = product_vendors;
	}

	public Product_Classification getProduct_classification() {
		return product_classification;
	}

	public void setProduct_classification(Product_Classification product_classification) {
		this.product_classification = product_classification;
	}

	public Product_Brand getProduct_brand() {
		return product_brand;
	}

	public void setProduct_brand(Product_Brand product_brand) {
		this.product_brand = product_brand;
	}

	public String getItem_state() {
		return item_state;
	}

	public void setItem_state(String item_state) {
		this.item_state = item_state;
	}

	public String[] getSpecifications() {
		return specifications;
	}

	public void setSpecifications(String[] specifications) {
		this.specifications = specifications;
	}

	public Attributes getAttributes() {
		return attributes;
	}

	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	public String getCountry_of_origin() {
		return country_of_origin;
	}

	public void setCountry_of_origin(String country_of_origin) {
		this.country_of_origin = country_of_origin;
	}

	public String getRelationship_type_code() {
		return relationship_type_code;
	}

	public void setRelationship_type_code(String relationship_type_code) {
		this.relationship_type_code = relationship_type_code;
	}

	public boolean isSubscription_eligible() {
		return subscription_eligible;
	}

	public void setSubscription_eligible(boolean subscription_eligible) {
		this.subscription_eligible = subscription_eligible;
	}

	public String[] getRibbons() {
		return ribbons;
	}

	public void setRibbons(String[] ribbons) {
		this.ribbons = ribbons;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

	public String getShip_to_restriction() {
		return ship_to_restriction;
	}

	public void setShip_to_restriction(String ship_to_restriction) {
		this.ship_to_restriction = ship_to_restriction;
	}

	public String getEstore_item_status_code() {
		return estore_item_status_code;
	}

	public void setEstore_item_status_code(String estore_item_status_code) {
		this.estore_item_status_code = estore_item_status_code;
	}

	public boolean isIs_proposition_65() {
		return is_proposition_65;
	}

	public void setIs_proposition_65(boolean is_proposition_65) {
		this.is_proposition_65 = is_proposition_65;
	}

	public HashMap<String, String> getReturn_policies() {
		return return_policies;
	}

	public void setReturn_policies(HashMap<String, String> return_policies) {
		this.return_policies = return_policies;
	}

	public boolean isGifting_enabled() {
		return gifting_enabled;
	}

	public void setGifting_enabled(boolean gifting_enabled) {
		this.gifting_enabled = gifting_enabled;
	}

	public HashMap<String, Boolean> getPackaging() {
		return packaging;
	}

	public void setPackaging(HashMap<String, Boolean> packaging) {
		this.packaging = packaging;
	}


	public static class Product_Description{
		private String  title;
		private String  downstream_description;
		private String  bullet_description;

		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDownstream_description() {
			return downstream_description;
		}
		public void setDownstream_description(String downstream_description) {
			this.downstream_description = downstream_description;
		}
		public String getBullet_description() {
			return bullet_description;
		}
		public void setBullet_description(String bullet_description) {
			this.bullet_description = bullet_description;
		}
	}

	public static class Attributes {
		private char gift_wrapable;
		private char  has_prop65;
		private char is_hazmat;
		private String manufacturing_brand;
		private int max_order_qty;
		private Date street_date;
		private String media_format;
		private String merch_class;
		private int merch_classid;
		private int merch_subclass;
		private String return_method;
		private String ship_to_restriction;
		public char getGift_wrapable() {
			return gift_wrapable;
		}
		public void setGift_wrapable(char gift_wrapable) {
			this.gift_wrapable = gift_wrapable;
		}
		public char getHas_prop65() {
			return has_prop65;
		}
		public void setHas_prop65(char has_prop65) {
			this.has_prop65 = has_prop65;
		}
		public char getIs_hazmat() {
			return is_hazmat;
		}
		public void setIs_hazmat(char is_hazmat) {
			this.is_hazmat = is_hazmat;
		}
		public String getManufacturing_brand() {
			return manufacturing_brand;
		}
		public void setManufacturing_brand(String manufacturing_brand) {
			this.manufacturing_brand = manufacturing_brand;
		}
		public int getMax_order_qty() {
			return max_order_qty;
		}
		public void setMax_order_qty(int max_order_qty) {
			this.max_order_qty = max_order_qty;
		}
		public Date getStreet_date() {
			return street_date;
		}
		public void setStreet_date(Date street_date) {
			this.street_date = street_date;
		}
		public String getMedia_format() {
			return media_format;
		}
		public void setMedia_format(String media_format) {
			this.media_format = media_format;
		}
		public String getMerch_class() {
			return merch_class;
		}
		public void setMerch_class(String merch_class) {
			this.merch_class = merch_class;
		}
		public int getMerch_classid() {
			return merch_classid;
		}
		public void setMerch_classid(int merch_classid) {
			this.merch_classid = merch_classid;
		}
		public int getMerch_subclass() {
			return merch_subclass;
		}
		public void setMerch_subclass(int merch_subclass) {
			this.merch_subclass = merch_subclass;
		}
		public String getReturn_method() {
			return return_method;
		}
		public void setReturn_method(String return_method) {
			this.return_method = return_method;
		}
		public String getShip_to_restriction() {
			return ship_to_restriction;
		}
		public void setShip_to_restriction(String ship_to_restriction) {
			this.ship_to_restriction = ship_to_restriction;
		}

	}

	public static class Product_Brand {
		private String brand;
		private String manufacturer_brand;
		private String facet_id;


		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getManufacturer_brand() {
			return manufacturer_brand;
		}
		public void setManufacturer_brand(String manufacturer_brand) {
			this.manufacturer_brand = manufacturer_brand;
		}
		public String getFacet_id() {
			return facet_id;
		}
		public void setFacet_id(String facet_id) {
			this.facet_id = facet_id;
		}

	}

	public static class Item_type{
		private String category_type;
		private int type;
		private String name;
		public String getCategory_type() {
			return category_type;
		}
		public void setCategory_type(String category_type) {
			this.category_type = category_type;
		}
		public int getType() {
			return type;
		}
		public void setType(int type) {
			this.type = type;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

	}


	public class Product_Classification {
		private String product_type;
		private String product_type_name;
		private String item_type_name;
		private Item_type item_type;

		public String getProduct_type() {
			return product_type;
		}
		public void setProduct_type(String product_type) {
			this.product_type = product_type;
		}
		public String getProduct_type_name() {
			return product_type_name;
		}
		public void setProduct_type_name(String product_type_name) {
			this.product_type_name = product_type_name;
		}
		public String getItem_type_name() {
			return item_type_name;
		}
		public void setItem_type_name(String item_type_name) {
			this.item_type_name = item_type_name;
		}
		public Item_type getItem_type() {
			return item_type;
		}
		public void setItem_type(Item_type item_type) {
			this.item_type = item_type;
		}


	}

	public static class Vendors{
		private String id;
		private String manufacturer_style;
		private String vendor_name;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getManufacturer_style() {
			return manufacturer_style;
		}
		public void setManufacturer_style(String manufacturer_style) {
			this.manufacturer_style = manufacturer_style;
		}
		public String getVendor_name() {
			return vendor_name;
		}
		public void setVendor_name(String vendor_name) {
			this.vendor_name = vendor_name;
		}

	}

	public static class Package_Dimention {
		private float weight;
		private String weight_unit_of_measure;
		private String width;
		private String depth;
		private String height;
		private String dimension_unit_of_measure;
		public float getWeight() {
			return weight;
		}
		public void setWeight(float weight) {
			this.weight = weight;
		}
		public String getWeight_unit_of_measure() {
			return weight_unit_of_measure;
		}
		public void setWeight_unit_of_measure(String weight_unit_of_measure) {
			this.weight_unit_of_measure = weight_unit_of_measure;
		}
		public String getWidth() {
			return width;
		}
		public void setWidth(String width) {
			this.width = width;
		}
		public String getDepth() {
			return depth;
		}
		public void setDepth(String depth) {
			this.depth = depth;
		}
		public String getHeight() {
			return height;
		}
		public void setHeight(String height) {
			this.height = height;
		}
		public String getDimension_unit_of_measure() {
			return dimension_unit_of_measure;
		}
		public void setDimension_unit_of_measure(String dimension_unit_of_measure) {
			this.dimension_unit_of_measure = dimension_unit_of_measure;
		}

	}

	public static class Fulfillment{
		private boolean is_po_box_prohibited;
		private String po_box_prohibited_message;
		private float box_percent_filled_by_volume;
		private float box_percent_filled_by_weight;
		private float box_percent_filled_display;

		public boolean isIs_po_box_prohibited() {
			return is_po_box_prohibited;
		}
		public void setIs_po_box_prohibited(boolean is_po_box_prohibited) {
			this.is_po_box_prohibited = is_po_box_prohibited;
		}
		public String getPo_box_prohibited_message() {
			return po_box_prohibited_message;
		}
		public void setPo_box_prohibited_message(String po_box_prohibited_message) {
			this.po_box_prohibited_message = po_box_prohibited_message;
		}
		public float getBox_percent_filled_by_volume() {
			return box_percent_filled_by_volume;
		}
		public void setBox_percent_filled_by_volume(float box_percent_filled_by_volume) {
			this.box_percent_filled_by_volume = box_percent_filled_by_volume;
		}
		public float getBox_percent_filled_by_weight() {
			return box_percent_filled_by_weight;
		}
		public void setBox_percent_filled_by_weight(float box_percent_filled_by_weight) {
			this.box_percent_filled_by_weight = box_percent_filled_by_weight;
		}
		public float getBox_percent_filled_display() {
			return box_percent_filled_display;
		}
		public void setBox_percent_filled_display(float box_percent_filled_display) {
			this.box_percent_filled_display = box_percent_filled_display;
		}

	} 

	public static class Tax_Category {
		private String tax_class;
		private int  tax_code_id;
		private String tax_code;
		public String getTax_class() {
			return tax_class;
		}
		public void setTax_class(String tax_class) {
			this.tax_class = tax_class;
		}
		public int getTax_code_id() {
			return tax_code_id;
		}
		public void setTax_code_id(int tax_code_id) {
			this.tax_code_id = tax_code_id;
		}
		public String getTax_code() {
			return tax_code;
		}
		public void setTax_code(String tax_code) {
			this.tax_code = tax_code;
		}

	}

	public static class Enrichment {
		private Images images;
		private HashMap<String, String> sales_classification_nodes;
		public Images getImages() {
			return images;
		}
		public void setImages(Images images) {
			this.images = images;
		}
		public HashMap<String, String> getSales_classification_nodes() {
			return sales_classification_nodes;
		}
		public void setSales_classification_nodes(HashMap<String, String> sales_classification_nodes) {
			this.sales_classification_nodes = sales_classification_nodes;
		}

	}

	public static class Images{
		private String base_url;
		private String primary;
		private HashMap<String, String> content_labels;
		public String getBase_url() {
			return base_url;
		}
		public void setBase_url(String base_url) {
			this.base_url = base_url;
		}
		public String getPrimary() {
			return primary;
		}
		public void setPrimary(String primary) {
			this.primary = primary;
		}
		public HashMap<String, String> getContent_labels() {
			return content_labels;
		}
		public void setContent_labels(HashMap<String, String> content_labels) {
			this.content_labels = content_labels;
		}                

	}

}
*/

public class Item {
	  @Override
	public String toString() {
		return "Item [tcin=" + tcin + ", Bundle_componentsObject=" + Bundle_componentsObject + ", dpci=" + dpci
				+ ", upc=" + upc + ", Product_descriptionObject=" + Product_descriptionObject + ", buy_url=" + buy_url
				+ ", EnrichmentObject=" + EnrichmentObject + ", return_method=" + return_method + ", HandlingObject="
				+ HandlingObject + ", Recall_complianceObject=" + Recall_complianceObject + ", Tax_categoryObject="
				+ Tax_categoryObject + ", Display_optionObject=" + Display_optionObject + ", FulfillmentObject="
				+ FulfillmentObject + ", Package_dimensionsObject=" + Package_dimensionsObject
				+ ", Environmental_segmentationObject=" + Environmental_segmentationObject + ", ManufacturerObject="
				+ ManufacturerObject + ", product_vendors=" + product_vendors + ", Product_classificationObject="
				+ Product_classificationObject + ", Product_brandObject=" + Product_brandObject + ", item_state="
				+ item_state + ", specifications=" + specifications + ", AttributesObject=" + AttributesObject
				+ ", country_of_origin=" + country_of_origin + ", relationship_type_code=" + relationship_type_code
				+ ", subscription_eligible=" + subscription_eligible + ", ribbons=" + ribbons + ", tags=" + tags
				+ ", ship_to_restriction=" + ship_to_restriction + ", estore_item_status_code="
				+ estore_item_status_code + ", is_proposition_65=" + is_proposition_65 + ", Return_policiesObject="
				+ Return_policiesObject + ", gifting_enabled=" + gifting_enabled + ", PackagingObject="
				+ PackagingObject + "]";
	}

	private String tcin;
	  Bundle_components Bundle_componentsObject;
	  private String dpci;
	  private String upc;
	  Product_description Product_descriptionObject;
	  private String buy_url;
	  Enrichment EnrichmentObject;
	  private String return_method;
	  Handling HandlingObject;
	  Recall_compliance Recall_complianceObject;
	  Tax_category Tax_categoryObject;
	  Display_option Display_optionObject;
	  Fulfillment FulfillmentObject;
	  Package_dimensions Package_dimensionsObject;
	  Environmental_segmentation Environmental_segmentationObject;
	  Manufacturer ManufacturerObject;
	  ArrayList<Object> product_vendors = new ArrayList<Object>();
	  Product_classification Product_classificationObject;
	  Product_brand Product_brandObject;
	  private String item_state;
	  ArrayList<Object> specifications = new ArrayList<Object>();
	  Attributes AttributesObject;
	  private String country_of_origin;
	  private String relationship_type_code;
	  private boolean subscription_eligible;
	  ArrayList<Object> ribbons = new ArrayList<Object>();
	  ArrayList<Object> tags = new ArrayList<Object>();
	  private String ship_to_restriction;
	  private String estore_item_status_code;
	  private boolean is_proposition_65;
	  Return_policies Return_policiesObject;
	  private boolean gifting_enabled;
	  Packaging PackagingObject;


	 // Getter Methods 

	  public String getTcin() {
	    return tcin;
	  }

	  public Bundle_components getBundle_components() {
	    return Bundle_componentsObject;
	  }

	  public String getDpci() {
	    return dpci;
	  }

	  public String getUpc() {
	    return upc;
	  }

	  public Product_description getProduct_description() {
	    return Product_descriptionObject;
	  }

	  public String getBuy_url() {
	    return buy_url;
	  }

	  public Enrichment getEnrichment() {
	    return EnrichmentObject;
	  }

	  public String getReturn_method() {
	    return return_method;
	  }

	  public Handling getHandling() {
	    return HandlingObject;
	  }

	  public Recall_compliance getRecall_compliance() {
	    return Recall_complianceObject;
	  }

	  public Tax_category getTax_category() {
	    return Tax_categoryObject;
	  }

	  public Display_option getDisplay_option() {
	    return Display_optionObject;
	  }

	  public Fulfillment getFulfillment() {
	    return FulfillmentObject;
	  }

	  public Package_dimensions getPackage_dimensions() {
	    return Package_dimensionsObject;
	  }

	  public Environmental_segmentation getEnvironmental_segmentation() {
	    return Environmental_segmentationObject;
	  }

	  public Manufacturer getManufacturer() {
	    return ManufacturerObject;
	  }

	  public Product_classification getProduct_classification() {
	    return Product_classificationObject;
	  }

	  public Product_brand getProduct_brand() {
	    return Product_brandObject;
	  }

	  public String getItem_state() {
	    return item_state;
	  }

	  public Attributes getAttributes() {
	    return AttributesObject;
	  }

	  public String getCountry_of_origin() {
	    return country_of_origin;
	  }

	  public String getRelationship_type_code() {
	    return relationship_type_code;
	  }

	  public boolean getSubscription_eligible() {
	    return subscription_eligible;
	  }

	  public String getShip_to_restriction() {
	    return ship_to_restriction;
	  }

	  public String getEstore_item_status_code() {
	    return estore_item_status_code;
	  }

	  public boolean getIs_proposition_65() {
	    return is_proposition_65;
	  }

	  public Return_policies getReturn_policies() {
	    return Return_policiesObject;
	  }

	  public boolean getGifting_enabled() {
	    return gifting_enabled;
	  }

	  public Packaging getPackaging() {
	    return PackagingObject;
	  }

	 // Setter Methods 

	  public void setTcin( String tcin ) {
	    this.tcin = tcin;
	  }

	  public void setBundle_components( Bundle_components bundle_componentsObject ) {
	    this.Bundle_componentsObject = bundle_componentsObject;
	  }

	  public void setDpci( String dpci ) {
	    this.dpci = dpci;
	  }

	  public void setUpc( String upc ) {
	    this.upc = upc;
	  }

	  public void setProduct_description( Product_description product_descriptionObject ) {
	    this.Product_descriptionObject = product_descriptionObject;
	  }

	  public void setBuy_url( String buy_url ) {
	    this.buy_url = buy_url;
	  }

	  public void setEnrichment( Enrichment enrichmentObject ) {
	    this.EnrichmentObject = enrichmentObject;
	  }

	  public void setReturn_method( String return_method ) {
	    this.return_method = return_method;
	  }

	  public void setHandling( Handling handlingObject ) {
	    this.HandlingObject = handlingObject;
	  }

	  public void setRecall_compliance( Recall_compliance recall_complianceObject ) {
	    this.Recall_complianceObject = recall_complianceObject;
	  }

	  public void setTax_category( Tax_category tax_categoryObject ) {
	    this.Tax_categoryObject = tax_categoryObject;
	  }

	  public void setDisplay_option( Display_option display_optionObject ) {
	    this.Display_optionObject = display_optionObject;
	  }

	  public void setFulfillment( Fulfillment fulfillmentObject ) {
	    this.FulfillmentObject = fulfillmentObject;
	  }

	  public void setPackage_dimensions( Package_dimensions package_dimensionsObject ) {
	    this.Package_dimensionsObject = package_dimensionsObject;
	  }

	  public void setEnvironmental_segmentation( Environmental_segmentation environmental_segmentationObject ) {
	    this.Environmental_segmentationObject = environmental_segmentationObject;
	  }

	  public void setManufacturer( Manufacturer manufacturerObject ) {
	    this.ManufacturerObject = manufacturerObject;
	  }

	  public void setProduct_classification( Product_classification product_classificationObject ) {
	    this.Product_classificationObject = product_classificationObject;
	  }

	  public void setProduct_brand( Product_brand product_brandObject ) {
	    this.Product_brandObject = product_brandObject;
	  }

	  public void setItem_state( String item_state ) {
	    this.item_state = item_state;
	  }

	  public void setAttributes( Attributes attributesObject ) {
	    this.AttributesObject = attributesObject;
	  }

	  public void setCountry_of_origin( String country_of_origin ) {
	    this.country_of_origin = country_of_origin;
	  }

	  public void setRelationship_type_code( String relationship_type_code ) {
	    this.relationship_type_code = relationship_type_code;
	  }

	  public void setSubscription_eligible( boolean subscription_eligible ) {
	    this.subscription_eligible = subscription_eligible;
	  }

	  public void setShip_to_restriction( String ship_to_restriction ) {
	    this.ship_to_restriction = ship_to_restriction;
	  }

	  public void setEstore_item_status_code( String estore_item_status_code ) {
	    this.estore_item_status_code = estore_item_status_code;
	  }

	  public void setIs_proposition_65( boolean is_proposition_65 ) {
	    this.is_proposition_65 = is_proposition_65;
	  }

	  public void setReturn_policies( Return_policies return_policiesObject ) {
	    this.Return_policiesObject = return_policiesObject;
	  }

	  public void setGifting_enabled( boolean gifting_enabled ) {
	    this.gifting_enabled = gifting_enabled;
	  }

	  public void setPackaging( Packaging packagingObject ) {
	    this.PackagingObject = packagingObject;
	  }
	}

	 class Packaging {
	  private boolean is_retail_ticketed;


	 // Getter Methods 

	  public boolean getIs_retail_ticketed() {
	    return is_retail_ticketed;
	  }

	 // Setter Methods 

	  public void setIs_retail_ticketed( boolean is_retail_ticketed ) {
	    this.is_retail_ticketed = is_retail_ticketed;
	  }
	}
	
	 
	 class Return_policies {
		 
	  private String user;
	  private String policyDays;
	  private String guestMessage;


	 // Getter Methods 

	  public String getUser() {
	    return user;
	  }

	  public String getPolicyDays() {
	    return policyDays;
	  }

	  public String getGuestMessage() {
	    return guestMessage;
	  }

	 // Setter Methods 

	  public void setUser( String user ) {
	    this.user = user;
	  }

	  public void setPolicyDays( String policyDays ) {
	    this.policyDays = policyDays;
	  }

	  public void setGuestMessage( String guestMessage ) {
	    this.guestMessage = guestMessage;
	  }
	}
	
	 
	 class Attributes {
	 
	  private String gift_wrapable;
	  private String has_prop65;
	  private String is_hazmat;
	  private String manufacturing_brand;
	  private float max_order_qty;
	  private String street_date;
	  private String media_format;
	  private String merch_class;
	  private float merch_classid;
	  private float merch_subclass;
	  private String return_method;
	  private String ship_to_restriction;


	 // Getter Methods 

	  public String getGift_wrapable() {
	    return gift_wrapable;
	  }

	  public String getHas_prop65() {
	    return has_prop65;
	  }

	  public String getIs_hazmat() {
	    return is_hazmat;
	  }

	  public String getManufacturing_brand() {
	    return manufacturing_brand;
	  }

	  public float getMax_order_qty() {
	    return max_order_qty;
	  }

	  public String getStreet_date() {
	    return street_date;
	  }

	  public String getMedia_format() {
	    return media_format;
	  }

	  public String getMerch_class() {
	    return merch_class;
	  }

	  public float getMerch_classid() {
	    return merch_classid;
	  }

	  public float getMerch_subclass() {
	    return merch_subclass;
	  }

	  public String getReturn_method() {
	    return return_method;
	  }

	  public String getShip_to_restriction() {
	    return ship_to_restriction;
	  }

	 // Setter Methods 

	  public void setGift_wrapable( String gift_wrapable ) {
	    this.gift_wrapable = gift_wrapable;
	  }

	  public void setHas_prop65( String has_prop65 ) {
	    this.has_prop65 = has_prop65;
	  }

	  public void setIs_hazmat( String is_hazmat ) {
	    this.is_hazmat = is_hazmat;
	  }

	  public void setManufacturing_brand( String manufacturing_brand ) {
	    this.manufacturing_brand = manufacturing_brand;
	  }

	  public void setMax_order_qty( float max_order_qty ) {
	    this.max_order_qty = max_order_qty;
	  }

	  public void setStreet_date( String street_date ) {
	    this.street_date = street_date;
	  }

	  public void setMedia_format( String media_format ) {
	    this.media_format = media_format;
	  }

	  public void setMerch_class( String merch_class ) {
	    this.merch_class = merch_class;
	  }

	  public void setMerch_classid( float merch_classid ) {
	    this.merch_classid = merch_classid;
	  }

	  public void setMerch_subclass( float merch_subclass ) {
	    this.merch_subclass = merch_subclass;
	  }

	  public void setReturn_method( String return_method ) {
	    this.return_method = return_method;
	  }

	  public void setShip_to_restriction( String ship_to_restriction ) {
	    this.ship_to_restriction = ship_to_restriction;
	  }
	}
	 
	 class Product_brand {
	  private String brand;
	  private String manufacturer_brand;
	  private String facet_id;


	 // Getter Methods 

	  public String getBrand() {
	    return brand;
	  }

	  public String getManufacturer_brand() {
	    return manufacturer_brand;
	  }

	  public String getFacet_id() {
	    return facet_id;
	  }

	 // Setter Methods 

	  public void setBrand( String brand ) {
	    this.brand = brand;
	  }

	  public void setManufacturer_brand( String manufacturer_brand ) {
	    this.manufacturer_brand = manufacturer_brand;
	  }

	  public void setFacet_id( String facet_id ) {
	    this.facet_id = facet_id;
	  }
	}
	 
	 class Product_classification {
	  private String product_type;
	  private String product_type_name;
	  private String item_type_name;
	  Item_type Item_typeObject;


	 // Getter Methods 

	  public String getProduct_type() {
	    return product_type;
	  }

	  public String getProduct_type_name() {
	    return product_type_name;
	  }

	  public String getItem_type_name() {
	    return item_type_name;
	  }

	  public Item_type getItem_type() {
	    return Item_typeObject;
	  }

	 // Setter Methods 

	  public void setProduct_type( String product_type ) {
	    this.product_type = product_type;
	  }

	  public void setProduct_type_name( String product_type_name ) {
	    this.product_type_name = product_type_name;
	  }

	  public void setItem_type_name( String item_type_name ) {
	    this.item_type_name = item_type_name;
	  }

	  public void setItem_type( Item_type item_typeObject ) {
	    this.Item_typeObject = item_typeObject;
	  }
	}
	 
	 class Item_type {
	  private String category_type;
	  private float type;
	  private String name;


	 // Getter Methods 

	  public String getCategory_type() {
	    return category_type;
	  }

	  public float getType() {
	    return type;
	  }

	  public String getName() {
	    return name;
	  }

	 // Setter Methods 

	  public void setCategory_type( String category_type ) {
	    this.category_type = category_type;
	  }

	  public void setType( float type ) {
	    this.type = type;
	  }

	  public void setName( String name ) {
	    this.name = name;
	  }
	}
	 
	 class Manufacturer {


	 // Getter Methods 



	 // Setter Methods 


	}
	 
	 class Environmental_segmentation {
	  private boolean is_hazardous_material;
	  private boolean has_lead_disclosure;


	 // Getter Methods 

	  public boolean getIs_hazardous_material() {
	    return is_hazardous_material;
	  }

	  public boolean getHas_lead_disclosure() {
	    return has_lead_disclosure;
	  }

	 // Setter Methods 

	  public void setIs_hazardous_material( boolean is_hazardous_material ) {
	    this.is_hazardous_material = is_hazardous_material;
	  }

	  public void setHas_lead_disclosure( boolean has_lead_disclosure ) {
	    this.has_lead_disclosure = has_lead_disclosure;
	  }
	}
	 
	 class Package_dimensions {
	  private String weight;
	  private String weight_unit_of_measure;
	  private String width;
	  private String depth;
	  private String height;
	  private String dimension_unit_of_measure;


	 // Getter Methods 

	  public String getWeight() {
	    return weight;
	  }

	  public String getWeight_unit_of_measure() {
	    return weight_unit_of_measure;
	  }

	  public String getWidth() {
	    return width;
	  }

	  public String getDepth() {
	    return depth;
	  }

	  public String getHeight() {
	    return height;
	  }

	  public String getDimension_unit_of_measure() {
	    return dimension_unit_of_measure;
	  }

	 // Setter Methods 

	  public void setWeight( String weight ) {
	    this.weight = weight;
	  }

	  public void setWeight_unit_of_measure( String weight_unit_of_measure ) {
	    this.weight_unit_of_measure = weight_unit_of_measure;
	  }

	  public void setWidth( String width ) {
	    this.width = width;
	  }

	  public void setDepth( String depth ) {
	    this.depth = depth;
	  }

	  public void setHeight( String height ) {
	    this.height = height;
	  }

	  public void setDimension_unit_of_measure( String dimension_unit_of_measure ) {
	    this.dimension_unit_of_measure = dimension_unit_of_measure;
	  }
	}
	 
	 class Fulfillment {
	  private boolean is_po_box_prohibited;
	  private String po_box_prohibited_message;
	  private float box_percent_filled_by_volume;
	  private float box_percent_filled_by_weight;
	  private float box_percent_filled_display;


	 // Getter Methods 

	  public boolean getIs_po_box_prohibited() {
	    return is_po_box_prohibited;
	  }

	  public String getPo_box_prohibited_message() {
	    return po_box_prohibited_message;
	  }

	  public float getBox_percent_filled_by_volume() {
	    return box_percent_filled_by_volume;
	  }

	  public float getBox_percent_filled_by_weight() {
	    return box_percent_filled_by_weight;
	  }

	  public float getBox_percent_filled_display() {
	    return box_percent_filled_display;
	  }

	 // Setter Methods 

	  public void setIs_po_box_prohibited( boolean is_po_box_prohibited ) {
	    this.is_po_box_prohibited = is_po_box_prohibited;
	  }

	  public void setPo_box_prohibited_message( String po_box_prohibited_message ) {
	    this.po_box_prohibited_message = po_box_prohibited_message;
	  }

	  public void setBox_percent_filled_by_volume( float box_percent_filled_by_volume ) {
	    this.box_percent_filled_by_volume = box_percent_filled_by_volume;
	  }

	  public void setBox_percent_filled_by_weight( float box_percent_filled_by_weight ) {
	    this.box_percent_filled_by_weight = box_percent_filled_by_weight;
	  }

	  public void setBox_percent_filled_display( float box_percent_filled_display ) {
	    this.box_percent_filled_display = box_percent_filled_display;
	  }
	}
	 
	 class Display_option {
	  private boolean is_size_chart;


	 // Getter Methods 

	  public boolean getIs_size_chart() {
	    return is_size_chart;
	  }

	 // Setter Methods 

	  public void setIs_size_chart( boolean is_size_chart ) {
	    this.is_size_chart = is_size_chart;
	  }
	}
	 
	 class Tax_category {
	  private String tax_class;
	  private float tax_code_id;
	  private String tax_code;


	 // Getter Methods 

	  public String getTax_class() {
	    return tax_class;
	  }

	  public float getTax_code_id() {
	    return tax_code_id;
	  }

	  public String getTax_code() {
	    return tax_code;
	  }

	 // Setter Methods 

	  public void setTax_class( String tax_class ) {
	    this.tax_class = tax_class;
	  }

	  public void setTax_code_id( float tax_code_id ) {
	    this.tax_code_id = tax_code_id;
	  }

	  public void setTax_code( String tax_code ) {
	    this.tax_code = tax_code;
	  }
	}
	 
	 class Recall_compliance {
	  private boolean is_product_recalled;


	 // Getter Methods 

	  public boolean getIs_product_recalled() {
	    return is_product_recalled;
	  }

	 // Setter Methods 

	  public void setIs_product_recalled( boolean is_product_recalled ) {
	    this.is_product_recalled = is_product_recalled;
	  }
	}
	 
	class Handling {


	 // Getter Methods 



	 // Setter Methods 


	}
	
	 class Enrichment {
	  ArrayList<Object> images = new ArrayList<Object>();
	  ArrayList<Object> sales_classification_nodes = new ArrayList<Object>();


	 // Getter Methods 



	 // Setter Methods 


	}
	 
	 class Product_description {
	  private String title;
	  private String downstream_description;
	  ArrayList<Object> bullet_description = new ArrayList<Object>();


	 // Getter Methods 

	  public String getTitle() {
	    return title;
	  }

	  public String getDownstream_description() {
	    return downstream_description;
	  }

	 // Setter Methods 

	  public void setTitle( String title ) {
	    this.title = title;
	  }

	  public void setDownstream_description( String downstream_description ) {
	    this.downstream_description = downstream_description;
	  }
	}
	 
	 class Bundle_components {


	 // Getter Methods 



	 // Setter Methods 


	}
	 
	 

