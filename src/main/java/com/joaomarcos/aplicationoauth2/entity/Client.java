package com.joaomarcos.aplicationoauth2.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
	
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Getter
	@Setter
	private boolean blocked;
	
	@Getter
	@Setter
	private boolean controlClientLimit;
	
	@Getter
	@Setter
	private boolean enabled;
	
	@Getter
	@Setter
	private String name;
	
	@Getter
	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
	private List<Phone> phones = new ArrayList<>();
	
	@Getter
	@Setter
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	

}
