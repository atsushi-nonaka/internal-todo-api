package com.example.model;

import java.util.List;

import com.example.domain.Todo;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodoListObject {
	@JsonProperty("data")
	public List<Todo> data;
}
