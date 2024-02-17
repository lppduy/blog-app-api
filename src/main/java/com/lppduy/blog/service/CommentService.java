package com.lppduy.blog.service;

import com.lppduy.blog.dtos.CommentDTO;

import java.util.List;

public interface CommentService {
    CommentDTO createComment(Long postId, CommentDTO commentDTO);
    List<CommentDTO> getCommentsByPostId(Long postId);
}
