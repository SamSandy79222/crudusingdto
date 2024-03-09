package com.example.demo.service;

import java.util.List;
import java.util.Optional;


import com.example.demo.dto.ProductDto;
import com.example.demo.model.Product;

public interface ProductService {

	public Product createProduct(ProductDto productDto);
	public Optional<Product> getProduct(long id);
	public List<Product> getAllProduct();
	public String updateProduct(long id,Product product);
	public String deleteProduct(long id);
}
