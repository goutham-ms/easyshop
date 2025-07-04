package com.easyshop.easy_shop.service.product;

import com.easyshop.easy_shop.dto.ProductDto;
import com.easyshop.easy_shop.model.Product;
import com.easyshop.easy_shop.request.AddProductRequest;
import com.easyshop.easy_shop.request.UpdateProductRequest;

import java.util.List;

public interface ProductService {
    Product addProduct(AddProductRequest product);

    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProductById(UpdateProductRequest product, Long id);

    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);

    Long countProductByBrandAndName(String brand, String name);

    List<ProductDto> getConvertedDto(List<Product> products);

    ProductDto convertToDto(Product product);
}
