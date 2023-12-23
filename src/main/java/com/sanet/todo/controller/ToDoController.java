package com.sanet.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanet.todo.entities.ToDoEntity;
import com.sanet.todo.services.ToDoService;

@RestController
@RequestMapping("/toDo")
public class ToDoController {
	
	@Autowired
	ToDoService toDoService;
	
	@GetMapping("/{userId}")
	public List<ToDoEntity> getAllUserToDo(@PathVariable int userId){
		return toDoService.getAllUserToDoList(userId);
	}
	
	@PostMapping("/save")
	public ToDoEntity saveToDoEntity(@RequestBody ToDoEntity toDoEntity) {
		return toDoService.saveToDoObj(toDoEntity);
	}
	
	@DeleteMapping("/{id}")
	public HttpStatus deleteToDoEntry(@PathVariable int id){
		toDoService.deleteToDoEntry(id);
		return HttpStatus.OK;
	}
	
	@PutMapping("/{id}")
	public ToDoEntity updateToDoEntity(@RequestBody ToDoEntity toDoEntity) {
		return toDoService.saveToDoObj(toDoEntity);
	}


}
