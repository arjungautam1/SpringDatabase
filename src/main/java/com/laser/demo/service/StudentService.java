package com.laser.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laser.demo.entity.StudentEntity;
import com.laser.demo.repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo studentRepository;
	
	public void saveStudent()
	{
		StudentEntity e=new StudentEntity();
		e.setCourse("Rock");
		e.setName("Mama");
		e.setSemester("Zero");
		studentRepository.save(e);
	}
	public List<StudentEntity> getStudent()
	{
		return studentRepository.findAll();
	}
	public void deleteStudent(Long id)
	{
		studentRepository.deleteById(id);
	}
	

}
