package com.joaomarcos.aplicationoauth2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaomarcos.aplicationoauth2.entity.Product ;
import com.joaomarcos.aplicationoauth2.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	

	public List<Product > findAll() {
		
		return productRepository.findAll();
	}

	public Product  findById(Integer id) {
		Optional<Product > product  = productRepository.findById(id);
		return product .get();
	}

	public Product  save(Product  product) {
		return productRepository.save(product);
	}
	

	public List<Product > saveAll(List<Product > list) {
		return productRepository.saveAll(list);
	}

	public void delete(Integer id) {
		productRepository.delete(findById(id));
	}

}
