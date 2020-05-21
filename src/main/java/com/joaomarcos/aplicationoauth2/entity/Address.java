package com.joaomarcos.aplicationoauth2.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	@Getter
	@Setter
	private String street;
	
	@Getter
	@Setter
	private String neighborhood;
	
	@Getter
	@Setter
	private String complement;
	
	@Getter
	@Setter
	private String streetNumber;
	
	@Getter
	@Setter
	private String zipCode;
	
	@Getter
	@Setter
	@OneToOne
	@MapsId
	private Client client;

}
