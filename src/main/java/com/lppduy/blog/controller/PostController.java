package com.lppduy.blog.controller;

import com.lppduy.blog.dtos.PostDTO;
import com.lppduy.blog.dtos.PostResponse;
import com.lppduy.blog.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("${api.prefix}/posts")
public class PostController {

    PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    ResponseEntity<PostDTO> createPost(@RequestBody PostDTO postDTO) {
        return new ResponseEntity<>(postService.createPost(postDTO), HttpStatus.CREATED);
    }

    @GetMapping
    ResponseEntity<PostResponse> getAllPosts(
            @RequestParam(value = "pageNo", defaultValue = "0", required = false) int pageNo,
            @RequestParam(value = "pageSize", defaultValue = "10", required = false) int pageSize
    ) {

        return ResponseEntity.ok(postService.getAllPosts(pageNo,pageSize));
    }

    @GetMapping("/{id}")
    ResponseEntity<?> getPostById(@PathVariable("id") Long id) {
        try {
            return ResponseEntity.ok(postService.getPostById(id));
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    ResponseEntity<?> updatePost(@RequestBody PostDTO postDTO, @PathVariable("id") Long id) {
        try {
            PostDTO postResponse = postService.updatePost(postDTO,id);
            return new ResponseEntity<>(postResponse, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    ResponseEntity<?> deletePost(@PathVariable("id") Long id) {
        try {
            postService.deletePostById(id);
            return new ResponseEntity<>(String.format("Deleted successfully post with the id: %s",id),
                    HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
