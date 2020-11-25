package com.demoweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoweb.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
