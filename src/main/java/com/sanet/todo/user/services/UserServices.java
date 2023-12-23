package com.sanet.todo.user.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanet.todo.user.entities.UserEntity;
import com.sanet.todo.user.repositories.UserRepo;

@Service
public class UserServices {

	@Autowired
	UserRepo userRepo;

	public UserEntity saveUserDetails(UserEntity userEntity) {
		return userRepo.save(userEntity);
	}

	public List<UserEntity> getAllUsersList() {
		return userRepo.findAll();
	}

}
