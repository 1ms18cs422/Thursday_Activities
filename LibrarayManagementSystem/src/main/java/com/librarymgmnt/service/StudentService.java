package com.librarymgmnt.service;

import java.util.List;

import com.librarymgmnt.dto.StudentDTO;

import com.librarymgmnt.entities.Student;

public interface StudentService {
	Student saveStudent(StudentDTO studentDTO);
	String deleteStudent(Integer id);
	String updateStudent(StudentDTO studentDTO,Integer id);
	Student getStudentById(Integer id);
	List<Student> getAllStudents();
	String deleteAllStudents();

	
}
