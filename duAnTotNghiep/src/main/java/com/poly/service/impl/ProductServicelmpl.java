package com.poly.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poly.dao.ProductsDAO;
import com.poly.entity.Products;
import com.poly.service.ProductService;


@Service
public class ProductServicelmpl implements ProductService{
	@Autowired
	ProductsDAO pdao;

	@Override
	public List<Products> findAll() {
		return pdao.findAll();
	}

	@Override
	public Products findById(int product_id) {
		return pdao.findById(product_id).get();
	}

	

}
