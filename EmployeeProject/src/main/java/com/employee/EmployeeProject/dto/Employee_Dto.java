package com.employee.EmployeeProject.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee_Dto {

	@Id
	private Long employee_id;
	private String employee_name;
	private String employee_city;

	public Long getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Long employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmployee_city() {
		return employee_city;
	}

	public void setEmployee_city(String employee_city) {
		this.employee_city = employee_city;
	}

	

}
