package com.easyshop.easy_shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class ImageDto {
    private Long id;
    private String fileName;
    private String downloadUrl;
}
