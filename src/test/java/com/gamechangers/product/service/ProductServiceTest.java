package com.gamechangers.product.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductServiceTest {

	@Test
	void test() {
		final ProductService productService = new ProductService();
		assertEquals(3, productService.add(1, 2));
	}
}
