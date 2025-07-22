package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
	@Autowired
	private StudentService service;
	
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student stud)
	{
		return service.saveStudent(stud);
	}
	
	@GetMapping("/{rollNo}")
	public Optional<Student> getStudent(@PathVariable Long rollNo)
	{
		return service.getStudent(rollNo);
	}
	
}
