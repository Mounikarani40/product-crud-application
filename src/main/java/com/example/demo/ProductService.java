package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	private final test productDAO;
	public ProductService(test productDAO) {
		this.productDAO = productDAO;
	}
	public Product save(Product product) {
		return productDAO.save(product);
	}
	public List<Product>findAll(){
		return productDAO.findAll();
	}
	public Product findById(int id) {
		return productDAO.findById(id).orElse(null);
	}
	public void updateById(int id,Product product) {
		Product oldProduct = productDAO.findById(id).orElse(null);
		if(oldProduct != null) {
			oldProduct.setName(product.getName());
			oldProduct.setPrice(product.getPrice());
			oldProduct.setQuantity(product.getQuantity());
			productDAO.save(oldProduct);
		}
	}
	public void deleteById(int id) {
		productDAO.deleteById(id);
	}

}
