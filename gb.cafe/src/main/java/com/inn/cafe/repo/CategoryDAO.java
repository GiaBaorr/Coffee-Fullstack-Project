package com.inn.cafe.repo;

import com.inn.cafe.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryDAO  extends JpaRepository<Category, Integer> {

    List<Category> getAllCategory();
}
