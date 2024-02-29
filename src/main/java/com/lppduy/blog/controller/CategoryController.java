package com.lppduy.blog.controller;

import com.lppduy.blog.payload.CategoryDTO;
import com.lppduy.blog.payload.PostDTO;
import com.lppduy.blog.service.CategoryService;
import com.lppduy.blog.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("${api.prefix}/categories")
public class CategoryController {

    private CategoryService categoryService;
    private PostService postService;

    public CategoryController(CategoryService categoryService, PostService postService) {
        this.categoryService = categoryService;
        this.postService = postService;
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<CategoryDTO> addCategory(@RequestBody CategoryDTO categoryDTO) {
        CategoryDTO savedCategory = categoryService.addCategory(categoryDTO);
        return new ResponseEntity<>(savedCategory, HttpStatus.CREATED );
    }

    @GetMapping("{id}")
    public ResponseEntity<CategoryDTO> getCategory(@PathVariable("id") Long categoryId) {
        CategoryDTO categoryDTO = categoryService.getCategory(categoryId);
        return new ResponseEntity<>(categoryDTO, HttpStatus.OK );
    }

    @GetMapping
    public ResponseEntity<List<CategoryDTO>> getCategories() {
        return new ResponseEntity<>(categoryService.getAllCategories(), HttpStatus.OK );
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("{id}")
    public ResponseEntity<CategoryDTO> updateCategory(
           @RequestBody CategoryDTO categoryDTO,@PathVariable("id") Long categoryId) {

        return new ResponseEntity<>(categoryService
                .updateCategory(categoryDTO,categoryId), HttpStatus.OK );
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable("id") Long categoryId) {
        categoryService.deleteCategory(categoryId);
        return new ResponseEntity<>("Category deleted successfully!.", HttpStatus.OK );
    }

}
