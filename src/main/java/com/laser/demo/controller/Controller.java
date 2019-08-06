package com.laser.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@PostMapping("/post")
	public void save() {
		studentService.saveStudent();
	}
	
	 @GetMapping("/get")  
	 public List<StudentEntity> getStudent() { 
		 return studentService.getStudent(); }
	 
	 @DeleteMapping("/{id}")
	 public void deleteStudent(@PathVariable Long id)
	 {
		 studentService.deleteStudent(id);
	 }
	 
	 
}
