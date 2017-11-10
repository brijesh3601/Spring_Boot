package com.producer.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.producer.model.Employee;

@RestController
public class ProducerController {
	
	@RequestMapping(value="/employee", method= RequestMethod.GET)
	public Employee getEmp() {
		Employee emp = new Employee();
		emp.setName("Brijesh");
		emp.setDesignation("Software Developer");
		emp.setEmpId("1");
		emp.setSalary(1234);
		return emp;
	}

}
