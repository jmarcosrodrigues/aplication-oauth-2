package com.joaomarcos.aplicationoauth2.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Entity
public class Phone implements Serializable {
	private static final long serialVersionUID = 1L;

	
	public Phone(Integer id, String number, String note) {
		super();
		this.id = id;
		this.number = number;
		this.note = note;
	}
	
	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Getter
	@Setter
	private String number;

	@Getter
	@Setter
	private String note;

	@Setter
	@Getter
	@ManyToOne
	@JoinColumn(name = "id_client")
	private Client client;

}
