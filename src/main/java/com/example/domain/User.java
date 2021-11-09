package com.example.domain;

import java.util.Date;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private String email;
    private Date createdAt;
    private Date updatedAt;
    private String password;
}