package com.junichi.jblog.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.junichi.jblog.domain.User;

@RestController
public class RESTController {
	
	// GET: SELECT
	@GetMapping("/jblog")
	public User httpGet() {
		User findUser = User.builder()
					.id(1)
					.username("lee")
					.password("222")
					.email("lee@gmail.com")
					.build();
		
		return findUser;
	}
	
	// POST: INSERT
	@PostMapping("/jblog")
	public String httpPost(@RequestBody User user) {
		return "POSTの要請を処理、入力値 : " + user.toString();
	}
	
	// PUT: UPDATE
	@PutMapping("/jblog")
	public String httpPut(@RequestBody User user) {
		return "PUTの要請を処理、入力値 : " + user.toString();
	}
	
	// DELETE: DELETE
	@DeleteMapping("/jblog")
	public String httpDelete(@RequestParam int id) {
		return "DELETEの要請を処理、入力値 : " + id;
	}
	
}
