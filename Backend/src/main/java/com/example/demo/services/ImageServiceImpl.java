package com.example.demo.services;

import com.example.demo.DAO.ImageDAO;
import com.example.demo.DAO.TaskDAO;
import com.example.demo.entity.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ImageServiceImpl implements ImageService{
    private final ImageDAO imageDAO;

    @Autowired
    public ImageServiceImpl(ImageDAO imageDAO) {
        this.imageDAO = imageDAO;
    }
    @Override
    public Optional<Image> findImageByName(String name) {
        return imageDAO.findByName(name);
    }

    @Override
    public Image saveImage(Image image) {
        return imageDAO.save(image);
    }
}
