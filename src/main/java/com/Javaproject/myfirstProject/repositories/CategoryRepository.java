package com.Javaproject.myfirstProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Javaproject.myfirstProject.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}