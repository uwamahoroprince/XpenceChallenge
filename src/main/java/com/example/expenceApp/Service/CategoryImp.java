package com.example.expenceApp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.expenceApp.Entity.Category;
import com.example.expenceApp.ExceptionHandler.NotDeletedException;
import com.example.expenceApp.ExceptionHandler.NotFoundException;
import com.example.expenceApp.ExceptionHandler.NotSavedException;
import com.example.expenceApp.ExceptionHandler.NotUpdatedException;
import com.example.expenceApp.Repository.CagegoryRepository;

@Service
public class CategoryImp implements CategoryService {
    @Autowired
    CagegoryRepository categoryRepo;

    @Override
    public Category postCategory(Category category) {
	// TODO Auto-generated method stub
	Category cat;
	try {
	    cat = categoryRepo.save(category);
	} catch (Exception e) {
	    throw new NotSavedException("Category Not Saved");
	}
	return cat;
    }

    @Override
    public List<Category> getAllCategories() {
	// TODO Auto-generated method stub
	List<Category> cat;
	try {
	    cat = categoryRepo.findAll();
	} catch (Exception e) {
	    throw new NotFoundException("unable to fetch Categories");
	}
	return cat;
    }

    @Override
    public void deleteCategoryS(Long id) {
	// TODO Auto-generated method stub
	try {
	    categoryRepo.deleteById(id);
	    
	} catch (Exception e) {
	    throw new NotDeletedException("Category not deleted");
	}
    }

    @Override
    public Category updateCategory(Category category) {
	// TODO Auto-generated method stub
	Category cat;
	try {
	    cat = categoryRepo.save(category);
	} catch (Exception e) {
	    throw new NotUpdatedException("Category not Updated");
	}
	return cat;
    }

    @Override
    public Category findCategoryById(Long id) {
	// TODO Auto-generated method stub
	Optional<Category> category = categoryRepo.findById(id);
	if (!category.isPresent()) {
	    throw new NotFoundException("Account not Found");
	}
	return category.get();
    }

}
