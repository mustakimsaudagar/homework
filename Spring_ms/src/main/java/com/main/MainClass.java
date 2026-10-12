package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Employee;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		Employee emp = context.getBean("emp", Employee.class);
		Employee emp1 = context.getBean("emp", Employee.class);


		System.out.println(emp.hashCode());
		System.out.println(emp1.hashCode());
		System.out.println(emp == emp1);

	}

}
