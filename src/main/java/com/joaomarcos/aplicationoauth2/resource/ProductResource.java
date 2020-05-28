package com.joaomarcos.aplicationoauth2.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaomarcos.aplicationoauth2.entity.Product;
import com.joaomarcos.aplicationoauth2.service.ProductService;

@RestController
@RequestMapping(value = "/products") 
public class ProductResource {
	
	@Autowired
	ProductService produtctService;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		return ResponseEntity.ok().body(produtctService.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Integer id){
		return ResponseEntity.ok().body(produtctService.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Product> save(@RequestBody Product product){
		return ResponseEntity.ok().body(produtctService.save(product));
	}
	
	@PostMapping(value = "/salve-all")
	public ResponseEntity<List<Product>> saveAll(@RequestBody List<Product> list){
		return ResponseEntity.ok().body(produtctService.saveAll(list));
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		produtctService.delete(id);
		return ResponseEntity.noContent().build();
	}

}
