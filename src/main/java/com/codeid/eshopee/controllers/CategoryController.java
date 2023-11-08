package com.codeid.eshopee.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codeid.eshopee.services.CategoryService;

@Controller
@RequestMapping("/categories")
public class CategoryController {

   
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping("/")
    public String showCategory(Model model){
        model.addAttribute("categories", categoryService.findAllCategory());
        return "/modules/category.html";
    }
    
}
