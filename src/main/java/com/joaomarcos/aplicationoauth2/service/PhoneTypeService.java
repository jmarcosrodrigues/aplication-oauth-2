package com.joaomarcos.aplicationoauth2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaomarcos.aplicationoauth2.entity.PhoneType;
import com.joaomarcos.aplicationoauth2.repository.PhoneTypeRepository;

@Service
public class PhoneTypeService {
	
	@Autowired
	PhoneTypeRepository  phoneTypeRepository;
	
	public List<PhoneType> findAll(){
		return phoneTypeRepository.findAll();
	}
	
	public PhoneType findById(Integer id) {
		Optional<PhoneType> phoneType = phoneTypeRepository.findById(id);
		return phoneType.get();
	}
	
	public PhoneType save(PhoneType phoneType) {
		return phoneTypeRepository.save(phoneType);
	}
	
	public List<PhoneType> saveAll(List<PhoneType> list) {
		return phoneTypeRepository.saveAll(list);
	}
	
	public void delete(Integer id) {
		phoneTypeRepository.delete(findById(id));
	}

}
