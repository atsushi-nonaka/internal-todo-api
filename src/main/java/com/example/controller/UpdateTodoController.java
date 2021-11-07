package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.constant.EntryPoint;
import com.example.model.UpsertTodoParameter;
import com.example.service.TodoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class UpdateTodoController {
	
	@Autowired
	private TodoService service;
	
	@PutMapping(EntryPoint.UPDATE_TODO)
	public void updateTodo(@RequestBody UpsertTodoParameter param) {
		log.info("更新処理を開始します");
		long currentTime = System.currentTimeMillis();
		service.updateTodo(param);
		log.info("更新処理を完了しました", System.currentTimeMillis() - currentTime);
	}
}
