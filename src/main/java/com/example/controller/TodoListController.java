package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.constant.EntryPoint;
import com.example.model.TodoListObject;
import com.example.service.TodoListService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TodoListController {
	
	@Autowired
	private TodoListService service;
	
	@GetMapping(EntryPoint.TODOS)
	public TodoListObject getTodoList() {
		log.info("サイト一覧取得開始");
		long startTime = System.currentTimeMillis(); 
		TodoListObject todoListObject = service.getTodoList();
		log.info("サイト一覧取得終了", System.currentTimeMillis() - startTime);
		return todoListObject;
	}
}
