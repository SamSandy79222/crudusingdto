package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ProductDto;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	
	
	@Override
	public Product createProduct(ProductDto productDto) {
		// TODO Auto-generated method stub
		Product product=new Product();
		product.setName(productDto.getName());
		product.setType(productDto.getType());
		product.setEancode(productDto.getEancode());

			Product product1 = productRepository.save(product);
		
		return product1;
	}

	@Override
	public Optional<Product> getProduct(long id) {
		// TODO Auto-generated method stub
		Optional<Product> product=productRepository.findById(id);
		
		return product;
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateProduct(long id, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteProduct(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
