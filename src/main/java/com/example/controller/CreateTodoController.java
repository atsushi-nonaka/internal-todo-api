package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.constant.EntryPoint;
import com.example.model.request.UpsertTodoParameter;
import com.example.service.TodoService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CreateTodoController {
	
	@Autowired
	private TodoService service;
	
	@PostMapping(EntryPoint.CREATE_TODO)
	public void createTodo(@RequestBody UpsertTodoParameter param) {
		log.info("登録処理を開始します");
		System.out.println("test");
		long currentTime = System.currentTimeMillis();
		service.addTodo(param);
		log.info("登録処理を完了しました", System.currentTimeMillis() - currentTime);
	}
}
