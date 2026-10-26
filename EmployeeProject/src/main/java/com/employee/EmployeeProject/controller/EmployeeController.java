package com.employee.EmployeeProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.EmployeeProject.dto.Employee_Dto;
import com.employee.EmployeeProject.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService serv;

	
	@PostMapping
	public Employee_Dto createemployee(@RequestBody Employee_Dto employee) {
		
	return serv.createemployee(employee);
	}
	
	@GetMapping 
	public Employee_Dto getemployee(@RequestParam Long id) {
		
		return serv.getemployee(id);	
	}
	
	@PutMapping
	public Employee_Dto updateemployee(@RequestBody Employee_Dto emp) {
	
		return serv.updateemployee(emp);
		
	}
	
	@DeleteMapping
	public void deleteemployee(@RequestParam Long id) {
		
		 serv.deleteemployee(id);
	}
	
}
	
	
	

