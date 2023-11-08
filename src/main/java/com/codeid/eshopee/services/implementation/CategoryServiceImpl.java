package com.codeid.eshopee.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeid.eshopee.model.Category;
import com.codeid.eshopee.repositories.CategoryRepository;
import com.codeid.eshopee.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

    
    private final CategoryRepository categoryRepo;

    public CategoryServiceImpl(CategoryRepository categoryRepo) {
        this.categoryRepo = categoryRepo;
    }


    @Override
    public List<Category> findAllCategory() {
        return categoryRepo.findAll();
    }

    @Override
    public Category addCategory(Category category) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addCategory'");
    }

    @Override
    public Optional<Category> findCategoryById(Integer cateId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findCategoryById'");
    }

    @Override
    public void deleteCategoryById(Integer cateId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCategoryById'");
    }
    
}
