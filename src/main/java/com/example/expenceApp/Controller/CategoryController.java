package com.example.expenceApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.expenceApp.Entity.Category;
import com.example.expenceApp.Service.CategoryService;

@RestController
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @PostMapping("/Category")
    public Category postCategory(@RequestBody Category category) {
	return categoryService.postCategory(category);
    }

    @GetMapping("/Category")
    public List<Category> getAllCategories() {
	return categoryService.getAllCategories();
    }
    @CrossOrigin
    @DeleteMapping("/Category/{id}")
    public void deleteCategory(@PathVariable("id") Long id) {
	categoryService.deleteCategoryS(id);

    }

    @PutMapping("/Category/{id}")
    public Category updateCategory(@PathVariable("id") Long id, @RequestBody Category category) {
	Category cat = categoryService.findCategoryById(id);
	cat.setName(category.getName());
	cat.setTransactionType(category.getTransactionType());
	return categoryService.updateCategory(cat);
    }

    @GetMapping("/Category/{id}")
    public Category findCategoryById(@PathVariable("id") Long id) {
	return categoryService.findCategoryById(id);
    }
}
