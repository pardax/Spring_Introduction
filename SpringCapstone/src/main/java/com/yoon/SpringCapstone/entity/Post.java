package com.yoon.SpringCapstone.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.yoon.SpringCapstone.dto.PostDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "dt_post")
@Getter
@Setter
@ToString
@NoArgsConstructor	//bin생성자
@AllArgsConstructor
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String categoryTitle;
	
	private String title;
	
	private String text;
	
	
	public static Post createPost(PostDto postDto) {
		Post post = new Post();
		post.setCategoryTitle(postDto.getCategoryTitle());
		post.setTitle(postDto.getTitle());
		post.setText(postDto.getText());
		
		return post;
	}
	
	public void updatePost(PostDto postDto) {
		this.categoryTitle = postDto.getCategoryTitle();
		this.title = postDto.getTitle();
		this.text = postDto.getText();
	}
}
