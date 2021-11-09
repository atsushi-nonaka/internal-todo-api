package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Todo;
import com.example.domain.TodosExample;
import com.example.mapper.TodosMapper;
import com.example.model.TodoListObject;

@Service
public class TodoListService {
	
	@Autowired
	private TodosMapper mapper;
	
	public TodoListObject getTodoList() {
		TodosExample example = new TodosExample();
		example.createCriteria();
		List<Todo> todoList = mapper.selectByExample(example);
		return returnResponse(todoList);
	}
	
	public TodoListObject returnResponse(List<Todo> todoList) {
		TodoListObject todoListObject = new TodoListObject();
		todoListObject.setData(todoList);
		return todoListObject;
	}
}
