package com.sanet.todo.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanet.todo.user.entities.UserEntity;
import com.sanet.todo.user.services.UserServices;

@RestController
@RequestMapping("/toDo/users")
public class UserController {

	@Autowired
	UserServices userService;
	
	@PostMapping
	public UserEntity saveUserEntity(@RequestBody UserEntity userEntity) {
		return userService.saveUserDetails(userEntity);
	}
	
	
	@GetMapping("/getall")
	public List<UserEntity> getAllUsers(){
		return userService.getAllUsersList();
	}
}
