package com.joaomarcos.aplicationoauth2.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Entity
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	public Client(Integer id, boolean blocked, boolean controlClientLimit, boolean enabled, String name, List<Phone> phones) {
		super();
		Id = id;
		this.blocked = blocked;
		this.controlClientLimit = controlClientLimit;
		this.enabled = enabled;
		this.name = name;

		if(phones != null) {
	      int count = 0;
		  for(Phone x : phones) {
	    	  this.phones.add(x);
	      }
			
		}

	}

	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	private boolean blocked;
	private boolean controlClientLimit;
	private boolean enabled;
	private String name;

	@Getter
	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
	private List<Phone> phones = new ArrayList<>();
	


}
