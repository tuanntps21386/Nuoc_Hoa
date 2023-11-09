package com.poly.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.poly.entity.Products;
import com.poly.service.ProductService;



@Controller
@RequestMapping("/home")
public class HomeController {
	

	@GetMapping("/index")
	public String homePage() {
		return "index";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/register")
	public String signup() {
		return "register";
	}
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
	@Autowired
//	ProductsDAO productDAO;
	ProductService productService;
	

	
	@RequestMapping("/product")
	public String list(Model model,@RequestParam(name = "keyword", required = false) String keyword) {
		 
		List<Products> list;
		if (keyword != null && !keyword.isEmpty()) {
	        list = productService.findByKeyword(keyword);
	    } else {
	        list = productService.findAll();
	    }
		model.addAttribute("items", list);
		//model.addAttribute("items", productDAO.findAll());
		return "product";
	}
//	@RequestMapping("/search-product")
//	public String index(Model model,@RequestParam(name = "keyword", required = false) Optional<String> keyword) {
//		
//		List<Products> list;
//		if (keyword.isPresent()) {
//			 list = productService.findByKeyword(keyword.get());
//			
//		}
//		else {
//			 list = productService.findAll();
//			
//		}
//		model.addAttribute("items", list);
//		
//		//model.addAttribute("items", list);
////		model.addAttribute("items", productDAO.fin	dAll());
//		return "/product/list";
//	}
	
	@RequestMapping("/cart")
	public String cart() {
		return "cart/gioHang";
	}
	
	@GetMapping("/chitietSP")
	public String chitietSP() {
		return "chitietSP";
	}
	
	@GetMapping("/productNew")
	public String productNew() {
		return "productNew";
	}
	
	@GetMapping("/productHot")
	public String productHot() {
		return "productHot";
	}
	
	@GetMapping("/spKhuyenMai")
	public String spKhuyenMai() {
		return "spKhuyenMai";
	}
	
	@GetMapping("/thuongHieu")
	public String thuongHieu() {
		return "thuongHieu";
	}
	
	@GetMapping("/kienThucNuocHoa")
	public String kienThucNuocHoa() {
		return "kienThucNuocHoa";
	}
	
	@GetMapping("/reviewNuocHoa")
	public String reviewNuocHoa() {
		return "reviewNuocHoa";
	}
	
	@GetMapping("/tinTucNuocHoa")
	public String tinTucNuocHoa() {
		return "tinTucNuocHoa";
	}
	
	@GetMapping("/phanBietNuocHoa")
	public String phanBietNuocHoa() {
		return "phanBietNuocHoa";
	}
	
	@GetMapping("/uaChuong")
	public String uaChuong() {
		return "uaChuong";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
}
