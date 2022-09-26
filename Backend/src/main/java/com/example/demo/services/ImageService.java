package com.example.demo.services;

import com.example.demo.entity.model.Image;

import java.util.Optional;

public interface ImageService {
    Optional<Image> findImageByName(String name);
    <Optional> Image saveImage(Image image);
}
