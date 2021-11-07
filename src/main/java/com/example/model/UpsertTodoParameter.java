package com.example.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class UpsertTodoParameter {
	@JsonProperty("id")
	private String id;
			
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("content")
	private String content;
	
	@JsonProperty("start_date")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate startDate;
	
	@JsonProperty("end_date")
	@JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;
	
	@JsonProperty("due_date")
	@JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dueDate;
}
