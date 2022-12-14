package com.yoon.SpringCapstone.utils;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yoon.SpringCapstone.dto.PostDto;
import com.yoon.SpringCapstone.entity.Post;
import com.yoon.SpringCapstone.repository.PostRepository;
import com.yoon.SpringCapstone.repository.UpdatePostRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Transactional
@Log4j2
@RequiredArgsConstructor
public class UpdatePost {
	
	private final UpdatePostRepository updatePostRepository;
	
	
	public boolean updateParameter(PostDto postDto) {
		Optional<Post> postOp = updatePostRepository.findById(postDto.getId());
		Post post = postOp.get();
		post.updatePost(postDto);
		
		return true;
	}
}