package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.dto.StudentDto;
import com.example.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repo;

	public StudentDto insertStudent(StudentDto student) {

		return repo.save(student);
	}

	public ResponseEntity<String> deleteStudent(Integer id) {

		Optional<StudentDto> studentPresent = repo.findById(id);
		if (!studentPresent.isEmpty()) {
			repo.deleteById(id);

			return ResponseEntity.ok("Student Deleted");
		}
		return (ResponseEntity<String>) ResponseEntity.notFound();

	}

	public List<StudentDto> getStudent() {

		return repo.findAll();
	}

	public StudentDto updateStudent(StudentDto std) {

		StudentDto student = repo.getById(std.getId());

		student.setName(std.getName());
		student.setCity(std.getCity());

		return student;
	}

}
