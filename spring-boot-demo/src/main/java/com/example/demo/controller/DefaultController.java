package com.example.demo.controller;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DefaultController {
	
	@RequestMapping("/hi")
	public @ResponseBody String hi() {
		return "Hi! there!";
	}
	
	@RequestMapping("/hi/{id}")
	public @ResponseBody String idHi(@Nullable @PathVariable("id") int id) {
		return "Hi! " + id;
	}
	
}
