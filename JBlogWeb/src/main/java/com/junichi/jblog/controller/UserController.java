package com.junichi.jblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.junichi.jblog.domain.RoleType;
import com.junichi.jblog.domain.User;
import com.junichi.jblog.persistence.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/user")
	public @ResponseBody String insertUser(@RequestBody User user) {
		
		user.setRole(RoleType.USER);
		userRepository.save(user);
		return user.getUsername() + " 会員登録ができました。";
		
	}
	
}
