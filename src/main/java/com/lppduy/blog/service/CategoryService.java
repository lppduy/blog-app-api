package com.lppduy.blog.service;

import com.lppduy.blog.payload.CategoryDTO;
import com.lppduy.blog.payload.PostDTO;

import java.util.List;

public interface CategoryService {
    CategoryDTO addCategory(CategoryDTO categoryDTO);
    CategoryDTO getCategory(Long categoryId);
    List<CategoryDTO> getAllCategories();
    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
    void deleteCategory(Long categoryId);
}
