package com.upgrad.ims.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.upgrad.ims.entities.Product;
import com.upgrad.ims.services.ProductService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private ProductService productService;

	@GetMapping
	public String getHomePage (Model model) {
		log.info("Presenting Home page");
		List<Product> products = productService.getAllProducts();
		log.info("Data size: " + products.size());
		model.addAttribute("products", products);
		return "home";
	}
	
	@GetMapping("/add")
	public String addProduct (Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "add";
	}
	
	@PostMapping("/add")
	public String storeProduct (Product product) {
		log.info(product.toString());
		productService.save(product);
		return "redirect:/";
	}
}
