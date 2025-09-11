package com.murilloleoni.course.repositories;

import com.murilloleoni.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}