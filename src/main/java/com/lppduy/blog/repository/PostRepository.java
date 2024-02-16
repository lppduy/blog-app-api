package com.lppduy.blog.repository;


import com.lppduy.blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
