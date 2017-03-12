package com.faisal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.faisal.model.Student;

@Service
public interface StudentService {
	public void add(Student student);
	public void edit(Student student);
	public void delete(int studentId);
	public Student getStudent(int studentId);
	public List getAllStudent();
	
}
