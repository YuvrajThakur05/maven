package com.yuvraj.product.bo;

import com.yuvraj.product.dao.ProductDAO;
import com.yuvraj.product.dao.ProductDAOImpl;
import com.yuvraj.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private static ProductDAO dao = new ProductDAOImpl();

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
