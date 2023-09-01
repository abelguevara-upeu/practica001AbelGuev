package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PostEntity;
import com.example.demo.repository.PostRepository;
import com.example.demo.service.PostService;
@Service
public class PostServiceImpl implements PostService{
	
	@Autowired
	private PostRepository postRepository;

	@Override
	public PostEntity create(PostEntity post) {
		// TODO Auto-generated method stub
		return postRepository.save(post);
	}

	@Override
	public List<PostEntity> readAll() {
		// TODO Auto-generated method stub
		return postRepository.findAll();
	}

	@Override
	public PostEntity update(PostEntity prod) {
		// TODO Auto-generated method stub
		return postRepository.save(prod);
	}

	@Override
	public void delete(Long id) {
		postRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public PostEntity read(Long id) {
		// TODO Auto-generated method stub
		return postRepository.findById(id).get();
	}

}