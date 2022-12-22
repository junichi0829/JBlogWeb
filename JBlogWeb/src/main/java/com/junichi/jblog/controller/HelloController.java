package com.junichi.jblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/html")
	public String html() {
		
		System.out.println("HTMLファイルが要請されました。");
		return "redirect:hello.html";
		
	}
	
	@GetMapping("/image")
	public String image() {
		
		System.out.println("画像ファイルが要請されました。");
		return "redirect:image/secretto.jpg";
		
	}
	
	@GetMapping("/jsp")
	public String jsp(Model model) {
		
		System.out.println("JSPファイルが要請されました。");
		model.addAttribute("username", "準一");
		return "hello";
		
	}
	
}
