package com.example.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.constant.EntryPoint;
import com.example.domain.Todo;
import com.example.service.TodoService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class AddTodoController {
	
	@Autowired
	private TodoService service;
	
	@GetMapping(EntryPoint.ADD_TODO)
	public void addTodo() {
		Todo todo = new Todo();
		todo.setId("999999");
		todo.setTitle("タイトル");
		todo.setContent("コンテント");
		todo.setStartDate(LocalDate.now());
		todo.setEndDate(LocalDate.now());
		todo.setDueDate(LocalDate.now());
		service.addTodo(todo);
	}
}
