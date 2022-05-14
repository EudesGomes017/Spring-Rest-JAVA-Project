package com.Javaproject.myfirstProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Javaproject.myfirstProject.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}