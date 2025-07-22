package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long rollNo;
	private String name;
	public Student(Long rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getRollNo() {
		return rollNo;
	}
	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
