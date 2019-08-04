package com.laser.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laser.demo.entity.StudentEntity;
import com.laser.demo.service.StudentService;

@RestController
@RequestMapping("/students")
public class Controller {

	@Autowired
	private StudentService studentService;

	@PostMapping("/hello")
	public void save() {
		studentService.saveStudent();
	}
	
	 @GetMapping("/he")  
	 public List<StudentEntity> getStudent() { 
		 return studentService.getStudent(); }
	 
}
