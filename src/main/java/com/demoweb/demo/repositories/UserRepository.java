package com.demoweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoweb.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
