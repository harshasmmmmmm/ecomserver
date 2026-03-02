package com.example.demo.repo;

import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {

    List<Product> findByCategoryIgnoreCase(String category);

    List<Product> findByProductNameContainingIgnoreCase(String productName);

    List<Product> findByVendorNameContainingIgnoreCase(String vendorName);

    List<Product> findByVendorId(Long vendorId);
}