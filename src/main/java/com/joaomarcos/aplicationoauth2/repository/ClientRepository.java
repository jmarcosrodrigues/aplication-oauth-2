package com.joaomarcos.aplicationoauth2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaomarcos.aplicationoauth2.entity.Client;

public interface ClientRepository extends JpaRepository<Client,Integer> {
    
}
