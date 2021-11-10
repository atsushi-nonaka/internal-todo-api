package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.constant.EntryPoint;
import com.example.model.UserObject;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UserController {
	
	@GetMapping(EntryPoint.USER)
	public UserObject getUser() {
		log.info("サイト一覧取得開始");
		long startTime = System.currentTimeMillis(); 
		log.info("サイト一覧取得終了", System.currentTimeMillis() - startTime);
		return new UserObject();
	}
}
