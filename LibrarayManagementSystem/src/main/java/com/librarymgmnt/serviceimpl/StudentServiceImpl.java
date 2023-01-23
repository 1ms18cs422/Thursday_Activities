package com.librarymgmnt.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarymgmnt.dto.StudentDTO;
import com.librarymgmnt.entities.Student;
import com.librarymgmnt.exceptions.StudentNotFoundException;
import com.librarymgmnt.repositories.StudentRepository;
import com.librarymgmnt.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	public Student saveStudent(StudentDTO studentDTO) {
		Student student=Student.builder()
				.studentName(studentDTO.getStudentName())
				.phoneNumber(studentDTO.getPhoneNumber())
				.studentEmail(studentDTO.getStudentEmail())
				.studentAddress(studentDTO.getStudentAddress())
				.studentAge(studentDTO.getStudentAge())
				.build();
			return studentRepository.save(student);
	}

	
	public String deleteStudent(Integer id) {
		studentRepository.deleteById(id);
		return "Deleted one record successully";
	}

	
	public String updateStudent(StudentDTO studentDTO, Integer id) {
		Student student=studentRepository.findById(id).get();
		Student studentObj=Student.builder()
				.studentName(studentDTO.getStudentName())
				.phoneNumber(studentDTO.getPhoneNumber())
				.studentEmail(studentDTO.getStudentEmail())
				.studentAddress(studentDTO.getStudentAddress())
				.studentAge(studentDTO.getStudentAge()).build();
		studentRepository.save(studentObj);
		return "Updated successfully";
	}

	
	public Student getStudentById(Integer id) {
		
		return studentRepository.findById(id).orElseThrow(()->new StudentNotFoundException("no student exist with the given id:"+id));
	}

	
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
		
	}

	
	public String deleteAllStudents() {
		
		 studentRepository.deleteAll();
		 return "Deleted successfully";
	}

}
