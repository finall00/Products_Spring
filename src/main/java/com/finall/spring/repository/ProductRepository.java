package com.finall.spring.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.finall.spring.model.ProductModel;


public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
    
}
