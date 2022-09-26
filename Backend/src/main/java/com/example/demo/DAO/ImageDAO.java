package com.example.demo.DAO;

import com.example.demo.entity.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ImageDAO extends JpaRepository<Image, Long> {
    Optional<Image> findByName(String name);
}
