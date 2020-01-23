package com.target.myretail.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.target.myretail.model.Price;

@RestController
@RequestMapping("/product")
public class PriceController {
	
	@RequestMapping("{productId}/price")
	public Price getPrice(@PathVariable("productId") int productId) {
		return new Price(19.3, "USD");
	}

	@RequestMapping(method = RequestMethod.POST,value = "/{productId}")
	public  ResponseEntity<Object>  addPrice(@RequestBody Price price,@PathVariable int productId) {
		return new ResponseEntity<>("Price is created successfully", HttpStatus.CREATED);
		
	}
	
	
}
