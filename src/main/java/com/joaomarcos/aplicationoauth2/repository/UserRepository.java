package com.joaomarcos.aplicationoauth2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaomarcos.aplicationoauth2.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
