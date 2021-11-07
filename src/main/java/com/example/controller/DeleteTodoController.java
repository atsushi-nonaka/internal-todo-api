package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.constant.EntryPoint;
import com.example.model.UpsertTodoParameter;
import com.example.model.DeleteTodoParameter;
import com.example.service.TodoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class DeleteTodoController {
	
	@Autowired
	private TodoService service;
	
	@DeleteMapping(EntryPoint.DELETE_TODO)
	public void deleteTodo(@PathVariable String id) {
		log.info("削除処理を開始します");
		long currentTime = System.currentTimeMillis();
		service.deleteTodo(id);
		log.info("削除処理を完了しました", System.currentTimeMillis() - currentTime);
	}
}
