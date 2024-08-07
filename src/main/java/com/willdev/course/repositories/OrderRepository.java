package com.willdev.course.repositories;

import com.willdev.course.entities.Order;
import com.willdev.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
