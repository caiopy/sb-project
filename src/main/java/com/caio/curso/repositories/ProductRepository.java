package com.caio.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caio.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
	
}
