package com.easyshop.easy_shop.service.category;

import com.easyshop.easy_shop.model.Category;

import java.util.List;

public interface CategoryService {
    Category getCategoryById(Long id);
    Category getCategoryByName(String name);
    List<Category> getAllCategories();
    Category addCategory(Category category);
    void deleteCategoryById(Long id);
    Category updateCategory(Category category, Long id);
}
