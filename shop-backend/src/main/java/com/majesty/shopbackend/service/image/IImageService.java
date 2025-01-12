package com.majesty.shopbackend.service.image;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.majesty.shopbackend.model.Image;
import com.majesty.shopbackend.dto.ImageDto;

public interface IImageService {
    Image getImageById(Long id);

    void deleteImageById(Long id);

    List<ImageDto> saveImages(Long productId, List<MultipartFile> files);

    void updateImage(MultipartFile file, Long imageId);
}
