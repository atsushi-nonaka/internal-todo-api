package com.example.domain;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
	private String id;
    private String title;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate dueDate;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private String content;
   
}