package com.joaomarcos.aplicationoauth2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaomarcos.aplicationoauth2.entity.Client;
import com.joaomarcos.aplicationoauth2.repository.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	ClientRepository  clientRepository;
	
	public List<Client> findAll(){
		return clientRepository.findAll();
	}
	
	public Client findById(Integer id) {
		Optional<Client> client = clientRepository.findById(id);
		return client.get();
	}
	
	public Client save(Client client) {
		return clientRepository.save(client);
	}
	
	public List<Client> saveAll(List<Client> list) {
		return clientRepository.saveAll(list);
	}
	
	public void delete(Integer id) {
		clientRepository.delete(findById(id));
	}

}
