package com.spring.boot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.models.Employee;

@RestController
public class ProducerController {
	
	@RequestMapping(value="/employee", method= RequestMethod.GET)
	public Employee getEmployee() {
		
		Employee emp = new Employee();
		emp.setId("1");
		emp.setName("Brijesh");
		emp.setDesignation("Software Developer");
		emp.setSalary(120000);
		return emp;
	}

}
