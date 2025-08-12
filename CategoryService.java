package com.example.demo;

import com.example.demo.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();

    Category updateCategory(Category category, Long categoryId);

    void createCategory(Category category);

    String deleteCategory(Long categoryId);



}
