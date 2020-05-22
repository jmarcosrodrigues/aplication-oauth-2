package com.joaomarcos.aplicationoauth2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaomarcos.aplicationoauth2.entity.Client;
import com.joaomarcos.aplicationoauth2.entity.Phone;
import com.joaomarcos.aplicationoauth2.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	

	public List<Client> findAll() {
		
		return clientRepository.findAll();
	}

	public Client findById(Integer id) {
		Optional<Client> client = clientRepository.findById(id);
		return client.get();
	}

	public Client save(Client client) {
		client.getPhones().forEach(phone -> phone.setClient(client));
		//client.getAddress().setClient(client);
		return clientRepository.save(client);
	}

	public List<Client> saveAll(List<Client> list) {
		
		for(Client client : list) {
			for(Phone phone : client.getPhones()) {
				phone.setClient(client);
			}
		}
		
		return clientRepository.saveAll(list);
	}

	public void delete(Integer id) {
		clientRepository.delete(findById(id));
	}

}
