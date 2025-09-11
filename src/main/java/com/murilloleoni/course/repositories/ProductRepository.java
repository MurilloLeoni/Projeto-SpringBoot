package com.murilloleoni.course.repositories;

import com.murilloleoni.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}