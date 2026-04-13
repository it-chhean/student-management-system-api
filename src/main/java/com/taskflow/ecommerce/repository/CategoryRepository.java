package com.taskflow.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskflow.ecommerce.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
    
}
