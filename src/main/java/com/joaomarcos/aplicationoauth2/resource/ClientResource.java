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

import com.joaomarcos.aplicationoauth2.entity.Client;
import com.joaomarcos.aplicationoauth2.service.ClientService;

@RestController
@RequestMapping(value = "/customers") 
public class ClientResource {
	
	@Autowired
	ClientService clientService;
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		return ResponseEntity.ok().body(clientService.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Client> findById(@PathVariable Integer id){
		return ResponseEntity.ok().body(clientService.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Client> save(@RequestBody Client client){
		return ResponseEntity.ok().body(client);
	}
	
	@PostMapping(value = "/salve-all")
	public ResponseEntity<List<Client>> saveAll(@RequestBody List<Client> list){
		return ResponseEntity.ok().body(list);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		clientService.delete(id);
		return ResponseEntity.noContent().build();
	}

}
