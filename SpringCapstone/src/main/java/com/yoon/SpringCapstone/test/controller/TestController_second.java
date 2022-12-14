package com.yoon.SpringCapstone.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yoon.SpringCapstone.dto.TempDto;

@Controller
public class TestController_second {
	
	@GetMapping("/imit")
	public String main() {
		
		return "test2";
	}
}
