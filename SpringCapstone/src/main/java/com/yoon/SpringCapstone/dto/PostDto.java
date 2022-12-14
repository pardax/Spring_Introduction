package com.yoon.SpringCapstone.dto;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostDto{

	@Id
	private Long id;
	
	@NotBlank(message = "카테고리 이름은 필수 항목 입니다.")
	private String categoryTitle;
	
	@NotBlank(message = "글 제목은 필수 항목 입니다.")	
	private String title;
	
	private String text;
}
