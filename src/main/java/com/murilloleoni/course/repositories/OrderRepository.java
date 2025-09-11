package com.murilloleoni.course.repositories;

import com.murilloleoni.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
