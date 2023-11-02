package com.poly.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.poly.entity.Products;

public interface ProductService {

	List<Products> findAll();

	Products findById(int product_id);

}
