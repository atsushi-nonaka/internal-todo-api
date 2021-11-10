package com.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.constant.EntryPoint;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CreateUserController {
	
	@PostMapping(EntryPoint.CREATE_USER)
	public void createTodo() {
		log.info("登録処理を開始します");
		long currentTime = System.currentTimeMillis();
		log.info("登録処理を完了しました", System.currentTimeMillis() - currentTime);
	}
}
