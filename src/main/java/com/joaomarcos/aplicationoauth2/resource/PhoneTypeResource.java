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

import com.joaomarcos.aplicationoauth2.entity.PhoneType;
import com.joaomarcos.aplicationoauth2.service.PhoneTypeService;

@RestController
@RequestMapping(value = "/phone-types") 
public class PhoneTypeResource {
	
	@Autowired
	PhoneTypeService phoneTypeService;
	
	@GetMapping
	public ResponseEntity<List<PhoneType>> findAll(){
		return ResponseEntity.ok().body(phoneTypeService.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<PhoneType> findById(@PathVariable Integer id){
		return ResponseEntity.ok().body(phoneTypeService.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<PhoneType> save(@RequestBody PhoneType PhoneType){
		return ResponseEntity.ok().body(PhoneType);
	}
	
	@PostMapping(value = "/salve-all")
	public ResponseEntity<List<PhoneType>> saveAll(@RequestBody List<PhoneType> list){
		return ResponseEntity.ok().body(list);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		phoneTypeService.delete(id);
		return ResponseEntity.noContent().build();
	}

}
