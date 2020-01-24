package com.target.myretail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;
import com.target.myretail.model.Price;
import com.target.myretail.model.ProductData;
import com.target.myretail.model.ProductResponse;

@RestController
public class ProductController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "v1/template/products/{productId}")
	public ResponseEntity<Object> getProduct(@PathVariable("productId") String productId) {
		ProductData productData = null;
		try {
			productData = restTemplate.getForObject("https://redsky.target.com/v2/pdp/tcin/" + productId
					+ "?excludes=taxonomy,price,promotion,bulk_ship,rating_and_review_reviews,rating_and_review_statistics,question_answer_statistics",
					ProductData.class);
		} catch (HttpStatusCodeException e) {
			if (e.getStatusCode() == HttpStatus.NOT_FOUND) {
				return ResponseEntity.ok("requested product id " + productId + " not found");
			} else {
				return ResponseEntity.badRequest().body(e);
			}
		}

		Price price = null;

		try {
			price = restTemplate.getForObject("http://localhost:8080/v1/product/12345/price", Price.class);
		} catch (HttpStatusCodeException e) {
			if (e.getStatusCode() == HttpStatus.NOT_FOUND) {
				return ResponseEntity.ok("requested product id " + productId + "price not found");
			} else {
				return ResponseEntity.badRequest().body(e);
			}
		}
		ProductResponse pr = new ProductResponse();
		pr.setId(productData.getProduct().getAvailable_to_promise_network().getProduct_id());
		pr.setName(productData.getProduct().getItem().getProduct_description().getTitle());
		pr.setPrice(price);
		return ResponseEntity.ok().body(pr);
	}

	@RequestMapping("v1/product/{productId}/price")
	public ResponseEntity<Object> getPrice(@PathVariable("productId") int productId) {
		Price price = new Price(19.3, "USD");
		return ResponseEntity.ok().body(price);
	}

	@RequestMapping(method = RequestMethod.POST, value = "v1/product/{productId}")
	public ResponseEntity<Object> addPrice(@RequestBody Price price, @PathVariable int productId) {
		return new ResponseEntity<>("Price is created successfully", HttpStatus.CREATED);

	}

}
