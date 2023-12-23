package com.sanet.todo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanet.todo.entities.ToDoEntity;
import com.sanet.todo.repositories.ToDoRepo;

@Service
public class ToDoService {
	
	@Autowired
	ToDoRepo toDoRepo;
	
	public List<ToDoEntity> getAllUserToDoList(int userId){
		return toDoRepo.findAllByUserId(userId);
	}
	
	public ToDoEntity saveToDoObj(ToDoEntity toDoEntity) {
		return toDoRepo.save(toDoEntity);
	}

	public void deleteToDoEntry(int id) {
		 toDoRepo.deleteById(id);
	}

}
