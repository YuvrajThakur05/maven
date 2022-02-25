package com.yuvraj.product.bo;

import com.yuvraj.product.dto.Product;

public interface ProductBO {

	void create(Product product);
	
	Product findProduct(int id);
}
