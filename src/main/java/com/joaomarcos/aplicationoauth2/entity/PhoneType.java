package com.joaomarcos.aplicationoauth2.entity;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_phone_type")
public class PhoneType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Getter
	@Setter
	private String description;
	
	@Getter
	@Setter
	private Instant modifiedDate;
	
	@JsonIgnore
	@Getter
	@Setter
    @OneToMany(mappedBy = "phoneType")
	private List<Phone> phones;
	
}
