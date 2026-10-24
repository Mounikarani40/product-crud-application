package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
	private final ProductService productService;
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	@GetMapping("/get")
	public List<Product>findAll(){
		return productService.findAll();
	}
	@PostMapping("/post")
	public Product saveproduct(@RequestBody Product product) {
		return productService.save(product);
	}
	@PutMapping("/update/{id}")
	public String update(
			@PathVariable int id,
			@RequestBody Product product) {
		productService.updateById(id, product);
		return "Product Updated Successfully";
	}
	@DeleteMapping("/delete/{id}")
	public String delete(
			@PathVariable int id) {
		productService.deleteById(id);
		return "Product Updated Successfully";
	}
	

}
