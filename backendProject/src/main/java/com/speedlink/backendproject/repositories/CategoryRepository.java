package com.speedlink.backendproject.repositories;

import com.speedlink.backendproject.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
     Category save(Category category);

}
