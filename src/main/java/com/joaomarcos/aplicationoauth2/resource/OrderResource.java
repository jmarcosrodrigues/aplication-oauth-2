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

import com.joaomarcos.aplicationoauth2.entity.Order;
import com.joaomarcos.aplicationoauth2.service.OrderService;

@RestController
@RequestMapping(value = "/orders") 
public class OrderResource {
	
	@Autowired
	OrderService orderService;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		return ResponseEntity.ok().body(orderService.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Integer id){
		return ResponseEntity.ok().body(orderService.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Order> save(@RequestBody Order order){
		return ResponseEntity.ok().body(orderService.save(order));
	}
	
	@PostMapping(value = "/salve-all")
	public ResponseEntity<List<Order>> saveAll(@RequestBody List<Order> list){
		return ResponseEntity.ok().body(orderService.saveAll(list));
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		orderService.delete(id);
		return ResponseEntity.noContent().build();
	}

}
