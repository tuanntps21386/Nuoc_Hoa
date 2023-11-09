package com.poly.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.poly.dao.ProductsDAO;
import com.poly.entity.Products;
import com.poly.service.ProductService;




@Controller

public class ProductController {
	@Autowired
//	ProductsDAO productDAO;
	ProductService productService;
	
	@RequestMapping("/product")
	public String index(Model model,@RequestParam(name = "keyword", required = false) Optional<String> keyword) {
		
		List<Products> list;
		if (keyword.isPresent()) {
			 list = productService.findByKeyword(keyword.get());
			
		}
		else {
			 list = productService.findAll();
			
		}
		model.addAttribute("items", list);
		
		//model.addAttribute("items", list);
//		model.addAttribute("items", productDAO.fin	dAll());
		return "product";
	}
	
	
	@RequestMapping("/product/chitietSP/{product_id}")
	public String detail(Model model, @PathVariable("product_id") int product_id) {
		Products item = productService.findById(product_id);
		model.addAttribute("item", item);
		return "product/chitietSP";
	}
	
	
}
