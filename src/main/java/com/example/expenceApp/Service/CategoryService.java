package com.example.expenceApp.Service;



import java.util.List;

import com.example.expenceApp.Entity.Category;

public interface CategoryService {

public Category postCategory(Category category);
public List<Category> getAllCategories();
public void deleteCategoryS(Long id);
public Category updateCategory(Category category);
public Category findCategoryById(Long id);
}
