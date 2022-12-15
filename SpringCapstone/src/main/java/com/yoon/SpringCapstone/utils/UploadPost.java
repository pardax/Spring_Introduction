package com.yoon.SpringCapstone.utils;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yoon.SpringCapstone.dto.PostDto;
import com.yoon.SpringCapstone.entity.Post;
import com.yoon.SpringCapstone.repository.PostRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Service
@Transactional
@Log4j2
@RequiredArgsConstructor
public class UploadPost {
	
	private final PostRepository postRepository;
	
	public Post uploadPost(Post writtenPost) {
		log.info("생성포스트" + writtenPost);
		return postRepository.save(writtenPost);
	}
	
	public boolean deletePost(Long id) {
		postRepository.deleteById(id);
		log.info("삭제 포스트 : " + id);
		return false;
	}
	
//	public PostDto updatePost(PostDto updatedPostDto) {
//		return postRepository.updatePost(updatedPostDto);
//	}
	
}
