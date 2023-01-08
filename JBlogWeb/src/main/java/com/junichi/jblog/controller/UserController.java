package com.junichi.jblog.controller;

import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.junichi.jblog.domain.RoleType;
import com.junichi.jblog.domain.User;
import com.junichi.jblog.exception.JBlogException;
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
	
	@GetMapping("/user/get/{id}")
	public @ResponseBody User getUser(@PathVariable int id) {
		
		// 特定のid（会員番号）に該当するUserオブジェクトを返還する。
		// 検索された会員がいない場合は例外を返還する。
//		User findUser = userRepository.findById(id).orElseThrow(new Supplier<JBlogException>() {
//			
//			@Override
//			public JBlogException get() {
//				return new JBlogException(id + "番の会員は存在しません。");
//			}
//			
//		});
		
		//上のコードと同一。ラムダ式を利用する。
		User findUser = userRepository.findById(id).orElseThrow( ()-> {
			return new JBlogException(id + "番の会員は存在しません。");
		});
		
		return findUser;
		
	}
	
	@Transactional
	@PutMapping("/user")
	public @ResponseBody String updateUser(@RequestBody User user) {
		
		User findUser = userRepository.findById(user.getId()).orElseThrow( () -> {
			return new JBlogException(user.getId() + "番の会員は存在しません。");
		});
		
		findUser.setUsername(user.getUsername());
		findUser.setPassword(user.getPassword());
		findUser.setEmail(user.getEmail());
		
//		userRepository.save(findUser);
		return "会員情報の修正ができました。";
		
	}
	
	@DeleteMapping("/user/{id}")
	public @ResponseBody String deleteUser(@PathVariable int id) {
		
		userRepository.deleteById(id);
		return "会員情報の削除ができました。";
		
	}
	
}
