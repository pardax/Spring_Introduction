package com.yoon.SpringCapstone.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoadPostDto {
	private Long id;
	
	private String categoryTitle;
	
	private String title;
	
	private String text;
}
