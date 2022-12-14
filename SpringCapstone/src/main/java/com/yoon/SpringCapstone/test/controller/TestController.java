package com.yoon.SpringCapstone.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yoon.SpringCapstone.dto.TempDto;

@Controller
public class TestController {
	
	@GetMapping("/test")
	public void main(Model model) {
		
		List<TempDto> item = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			TempDto temp = new TempDto();
			temp.setId((long)i);
			temp.setName("test Name is : " + i);
			item.add(temp);
		}

		model.addAttribute("list", item);
	}
}
