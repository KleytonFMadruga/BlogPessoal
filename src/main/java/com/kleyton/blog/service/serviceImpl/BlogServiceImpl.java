package com.kleyton.blog.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kleyton.blog.model.Post;
import com.kleyton.blog.repository.BlogRepository;
import com.kleyton.blog.service.BlogService;

import java.util.List;


@Service
public class BlogServiceImpl implements BlogService{
	
	@Autowired
	BlogRepository blogRepository;

	@Override
	public List<Post> findAll() {
		return blogRepository.findAll();
	}

	@Override
	public Post findById(long id) {
		
		return blogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return blogRepository.save(post);
	}

}
