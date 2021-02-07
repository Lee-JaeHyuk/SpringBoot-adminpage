package com.example.adminpage.repository;

import com.example.adminpage.model.entity.OrderGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderGroupRepository extends JpaRepository<OrderGroup,Long> {
}
