package com.example.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Todo;
import com.example.mapper.TodosMapper;

@Service
public class TodoService {
	
	@Autowired
	private TodosMapper mapper;
	
	public void addTodo(Todo todo) {
		mapper.insert(setDateTime(todo));
	}
	
	public Todo setDateTime(Todo todo) {
		todo.setCreatedAt(LocalDateTime.now());
		todo.setUpdatedAt(LocalDateTime.now());
		return todo;
	}
}
