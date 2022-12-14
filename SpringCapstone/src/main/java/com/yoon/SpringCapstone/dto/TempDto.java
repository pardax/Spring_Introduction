package com.yoon.SpringCapstone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TempDto{

	@Id
	private Long id;
	
	private String name;
	
}
