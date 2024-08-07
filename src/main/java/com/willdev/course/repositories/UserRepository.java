package com.willdev.course.repositories;

import com.willdev.course.entities.Category;
import com.willdev.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
