package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class DeleteTodoParameter {
	@JsonProperty("id")
	private String id;
}
