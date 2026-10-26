package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.StudentDto;
import com.example.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	private StudentService service;

	@PostMapping("/create")
	public StudentDto insertStudent(@RequestBody StudentDto student) {
		
		return service.insertStudent(student);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteStudent(@RequestParam Integer id) {
		
		return service.deleteStudent(id);
		
	}
	
	@GetMapping("/getall")
	public List<StudentDto> getStudent() {

		return service.getStudent();
		
		
	}
	
	@PutMapping
	public StudentDto updateStudent(@RequestBody StudentDto std) {
		
		return service.updateStudent(std);
		
	}
	
}
