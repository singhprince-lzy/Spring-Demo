package com.prince.spring.standalone.collection;

import java.util.List;

public class ProductList {
	
	List<String> productName;

	public List<String> getProductName() {
		return productName;
	}

	public void setProductName(List<String> productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "ProductList [productName=" + productName + "]";
	}
	
	
}
