package com.employee.EmployeeProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.EmployeeProject.dto.Employee_Dto;
import com.employee.EmployeeProject.repository.Repository;

@Service
public class EmployeeService {
	
	@Autowired
	private Repository repo;
	
	public Employee_Dto createemployee(Employee_Dto employee) {
		
		return repo.save(employee);
		
	}
	
	@SuppressWarnings("deprecation")
	public Employee_Dto getemployee(Long id) {
		
		return repo.getById(id);
	}
	
	public Employee_Dto updateemployee(Employee_Dto emp) {
		
		@SuppressWarnings("deprecation")
		Employee_Dto employee = repo.getById(emp.getEmployee_id());
		
		employee.setEmployee_name(emp.getEmployee_name());
		employee.setEmployee_city(emp.getEmployee_city());
		
		return employee;
	}
	
	public void deleteemployee(Long id) {
		
		
		 repo.deleteById(id);
		
	}
	
}
