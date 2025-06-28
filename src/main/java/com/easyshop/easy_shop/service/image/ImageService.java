package com.easyshop.easy_shop.service.image;

import com.easyshop.easy_shop.dto.ImageDto;
import com.easyshop.easy_shop.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ImageService {
    Image getImageById(Long id);
    List<ImageDto> saveImages(List<MultipartFile> files, Long productId);
    void deleteImage(Long id);
    void updateImage(MultipartFile file, Long imageId);
}
