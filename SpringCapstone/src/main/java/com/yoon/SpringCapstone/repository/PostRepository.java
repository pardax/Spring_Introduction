
package com.yoon.SpringCapstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yoon.SpringCapstone.dto.PostDto;
import com.yoon.SpringCapstone.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long>{
	

}
