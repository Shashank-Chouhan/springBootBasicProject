package com.company.YoutubeGuyProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping(path = "/")
	public String greet() {
		return "hello there";
	}

}
