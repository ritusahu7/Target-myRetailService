package com.target.myretail.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.target.myretail.model.Price;
import com.target.myretail.model.Product;
import com.target.myretail.model.ProductData;



@RestController
public class ProductController {

	
	 @Autowired
	   RestTemplate restTemplate;

	   @RequestMapping(value = "/template/products/{productId}")
	   public void getProductList(@PathVariable("productId") String productId) {
		   ProductData product = restTemplate.getForObject("https://redsky.target.com/v2/pdp/tcin/13860428?excludes=taxonomy,price,promotion,bulk_ship,rating_and_review_reviews,rating_and_review_statistics,question_answer_statistics"+productId , ProductData.class);
	//	   System.out.println(product.getItem().getBuy_url()	   );
	      HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity <String> entity = new HttpEntity<String>(headers);
	      
	   String response = restTemplate.exchange("https://redsky.target.com/v2/pdp/tcin/13860428?excludes=taxonomy,price,promotion,bulk_ship,rating_and_review_reviews,rating_and_review_statistics,question_answer_statistics", HttpMethod.GET, entity, String.class).getBody();
		System.out.println("Response = "+ response);  
	   System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
	   Price price =  restTemplate.getForObject("http://localhost:8081/product/12345/price" , Price.class);
	   System.out.println(price.toString());
//	   Gson g = new Gson();
//	   
//		   ProductData product1 = g.fromJson(response, ProductData.class);
//				  System.out.println(product1.getAvailable_to_promise_network().getProduct_id());
	   }
}
