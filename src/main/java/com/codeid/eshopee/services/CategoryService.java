package com.codeid.eshopee.services;

import java.util.List;
import java.util.Optional;

import com.codeid.eshopee.model.Category;

public interface CategoryService {

    List<Category> findAllCategory();
	
	Category addCategory(Category category);
	
	Optional<Category> findCategoryById(Integer cateId);
	
	void deleteCategoryById(Integer cateId);
    
}
