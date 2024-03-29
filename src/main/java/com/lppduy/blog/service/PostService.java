package com.lppduy.blog.service;

import com.lppduy.blog.payload.PostDTO;
import com.lppduy.blog.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDTO createPost(PostDTO postDTO);
    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
    PostDTO getPostById(Long id);
    PostDTO updatePost(PostDTO postDTO, Long id);
    void deletePostById(Long id);

    List<PostDTO> getPostsByCategory(Long categoryId);

}
