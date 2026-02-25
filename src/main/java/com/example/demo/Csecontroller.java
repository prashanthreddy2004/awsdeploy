package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class Csecontroller {

	@GetMapping("/adityacse")
	public String rocks() {
		return "Welcome to Jekins AWS from Aditya";
	}
	@GetMapping("/adityit")
		public String rocks1() {
			return "Welcome to CSE";
		}
	}