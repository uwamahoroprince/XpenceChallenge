package com.example.expenceApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.expenceApp.Entity.Category;
@Repository
public interface CagegoryRepository extends JpaRepository<Category, Long> {

}
