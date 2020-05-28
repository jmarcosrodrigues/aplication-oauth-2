package com.joaomarcos.aplicationoauth2.entity;

import java.io.Serializable;
import java.time.Instant;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_order")
public class Order implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Getter
	@Setter
	private Instant dateRegister;
	
	@Getter
	@Setter
	private String description;
	

	@Getter
	@Setter
	@ManyToOne
	@JoinColumn(name = "id_client")
	private Client client;
	
	@Getter
	@OneToMany(mappedBy = "id.order", cascade = CascadeType.ALL)
	private Set<OrderItem> orderItems;
	
}
