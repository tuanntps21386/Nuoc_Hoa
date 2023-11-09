package com.poly.service;

import java.util.List;
import com.poly.service.impl.*;
import com.poly.entity.Products;

public interface ProductService {

	List<Products> findAll();

	Products findById(int product_id);
	
	List<Products> findByKeyword(String keyword);
}
