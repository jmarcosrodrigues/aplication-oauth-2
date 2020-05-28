package com.joaomarcos.aplicationoauth2.entity.pk;

import java.io.Serializable;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.joaomarcos.aplicationoauth2.entity.Order;
import com.joaomarcos.aplicationoauth2.entity.Product;

import lombok.Getter;
import lombok.Setter;

public class OrderItemPK implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	@Getter
	@Setter
	@ManyToOne
	@JoinColumn(name="order_id")
	private Order order;
	
	@Getter
	@Setter
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	
	

}
