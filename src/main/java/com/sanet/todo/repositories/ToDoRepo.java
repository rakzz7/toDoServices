package com.sanet.todo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanet.todo.entities.ToDoEntity;

public interface ToDoRepo extends JpaRepository<ToDoEntity, Integer>{

	List<ToDoEntity> findAllByUserId(int userId);
}
