package com.app.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Employee;
import com.app.service.IEmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private IEmployeeService employeeService;
	
	public EmployeeController() {
		System.out.println("in ctor of " + getClass());
	}
		@GetMapping
		public List<Employee> getAllEmpDetails()
		{
			System.out.println("in get all emps");
			return employeeService.getAllEmployees();
		}
	
}
