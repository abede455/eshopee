package com.codeid.eshopee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codeid.eshopee.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
    
}
