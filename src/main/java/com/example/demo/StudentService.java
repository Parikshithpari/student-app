package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService
{
	@Autowired
	private StudentRepo repo;
	
	public Student saveStudent(Student stud)
	{
		return repo.save(stud);
	}
	
	public Optional<Student> getStudent(Long rollNo)
	{
		return repo.findById(rollNo);
	}
}
