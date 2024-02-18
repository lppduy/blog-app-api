package com.lppduy.blog.service;

import com.lppduy.blog.dtos.CommentDTO;

import java.util.List;

public interface CommentService {
    CommentDTO createComment(Long postId, CommentDTO commentDTO);
    List<CommentDTO> getCommentsByPostId(Long postId);
    CommentDTO getCommentById(Long postId, Long commentId);
    CommentDTO updateComment(Long postId, Long commentId, CommentDTO commentRequest);
    void deleteComment(Long postId, Long commentId);

}
