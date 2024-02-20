package com.kh.potato.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pocketmonController {

	@RequestMapping("/soyeon")
	public String home() {
		return "Hello!";
	}
}
