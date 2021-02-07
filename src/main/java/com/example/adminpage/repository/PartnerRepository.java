package com.example.adminpage.repository;

import com.example.adminpage.model.entity.Category;
import com.example.adminpage.model.entity.Partner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PartnerRepository extends JpaRepository<Partner,Long> {

    List<Partner> findByCategory(Category category);
}
