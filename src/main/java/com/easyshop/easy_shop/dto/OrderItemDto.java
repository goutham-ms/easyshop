package com.easyshop.easy_shop.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemDto {
    private Long productId;
    private String productName;
    private String brandName;
    private int quantity;
    private BigDecimal price;
}
