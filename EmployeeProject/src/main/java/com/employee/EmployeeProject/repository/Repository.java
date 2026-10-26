package com.employee.EmployeeProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.EmployeeProject.dto.Employee_Dto;

@org.springframework.stereotype.Repository

public interface Repository extends JpaRepository<Employee_Dto, Long>  {
	
	
}
