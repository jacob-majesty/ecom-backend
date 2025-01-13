package com.majesty.shopbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.majesty.shopbackend.model.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
    List<Image> findByProductId(Long id);
}
