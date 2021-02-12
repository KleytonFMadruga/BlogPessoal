package com.kleyton.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kleyton.blog.model.Post;


public interface BlogRepository extends JpaRepository<Post, Long>{

}
