package com.joaomarcos.aplicationoauth2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaomarcos.aplicationoauth2.entity.PhoneType;

public interface PhoneTypeRepository extends JpaRepository<PhoneType, Integer> {
    
}
