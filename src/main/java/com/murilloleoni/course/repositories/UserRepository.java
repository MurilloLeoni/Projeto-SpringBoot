package com.murilloleoni.course.repositories;

import com.murilloleoni.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
