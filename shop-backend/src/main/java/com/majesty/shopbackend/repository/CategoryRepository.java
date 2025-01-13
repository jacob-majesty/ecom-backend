package com.majesty.shopbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.majesty.shopbackend.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);

    boolean existsByName(String name);
}
