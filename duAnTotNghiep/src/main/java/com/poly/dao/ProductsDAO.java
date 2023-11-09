package com.poly.dao;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.poly.entity.Account;
import com.poly.entity.Products;

public interface ProductsDAO extends JpaRepository<Products, Integer>{
	@Query("SELECT a FROM Products a WHERE a.product_name LIKE %?1%")
	List<Products> findByKeyword(String keyword);
}
