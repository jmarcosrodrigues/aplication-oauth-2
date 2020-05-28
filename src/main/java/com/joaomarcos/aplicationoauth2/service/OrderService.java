package com.joaomarcos.aplicationoauth2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaomarcos.aplicationoauth2.entity.Order;
import com.joaomarcos.aplicationoauth2.entity.OrderItem;
import com.joaomarcos.aplicationoauth2.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	

	public List<Order> findAll() {
		
		return orderRepository.findAll();
	}

	public Order findById(Integer id) {
		Optional<Order> order = orderRepository.findById(id);
		return order.get();
	}

	public Order save(Order order) {
		order.getOrderItems().forEach(itemOrder ->  itemOrder.setOrder(order));
		return orderRepository.save(order);
	}

	public List<Order> saveAll(List<Order> list) {
		for(Order order : list) {
			for(OrderItem itemOrder : order.getOrderItems()) {
				itemOrder.setOrder(order);
			}
		}
		
		return orderRepository.saveAll(list);
	}

	public void delete(Integer id) {
		orderRepository.delete(findById(id));
	}

}
