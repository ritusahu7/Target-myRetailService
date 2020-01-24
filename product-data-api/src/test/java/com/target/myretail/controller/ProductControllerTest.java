package com.target.myretail.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.target.myretail.model.Product;

//@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(ProductController.class)
@SpringBootTest
public class ProductControllerTest {

	@MockBean
	private ProductController productController;

	@Autowired
	private MockMvc mvc;

	@Test
	public void getProductOkCase() throws Exception {
		String uri = "v1/template/products/13860429";
		Product p = new Product();
		productController = new ProductController();
		given(productController.getProduct("12133")).willReturn(ResponseEntity.ok(p));

		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		System.out.println("tested");
		assertEquals(200, status);
	}

	@Test
	public void getProductNotFoundCase() throws Exception {
		String uri = "v1/template/products/13860428";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		System.out.println("tested");
		assertEquals(404, status);
	}

}
