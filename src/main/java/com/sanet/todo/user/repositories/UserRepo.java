package com.sanet.todo.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanet.todo.user.entities.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity,Integer> {

}
