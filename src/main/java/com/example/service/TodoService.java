package com.example.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Todo;
import com.example.mapper.TodosMapper;
import com.example.model.request.UpsertTodoParameter;

@Service
@Transactional
public class TodoService {
	
	@Autowired
	private TodosMapper mapper;
	
	public void addTodo(UpsertTodoParameter param) {
		mapper.insert(setTodo(param, "insert"));
	}
	
	public void deleteTodo(String id) {
		mapper.deleteByPrimaryKey(id);
	}
	
	public void updateTodo(UpsertTodoParameter param) {
		mapper.updateByPrimaryKeySelective(setTodo(param, "update"));
	}
	
	public Todo setTodo(UpsertTodoParameter param, String process) {
		Todo todo = new Todo();
		todo.setId(param.getId());
		todo.setTitle(param.getTitle());
		todo.setContent(param.getContent());
		todo.setStartDate(param.getStartDate());
		todo.setEndDate(param.getEndDate());
		todo.setDueDate(param.getDueDate());
		return setDateTime(todo, process);
	}
	
	public Todo setDateTime(Todo todo, String process) {
		if (process.equals("insert")) {
			todo.setCreatedAt(LocalDateTime.now());			
		}
		todo.setUpdatedAt(LocalDateTime.now());
		return todo;
	}
}
