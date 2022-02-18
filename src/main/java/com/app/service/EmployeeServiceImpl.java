package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.EmployeeRepository;
import com.app.pojos.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements IEmployeeService  {
	@Autowired
	private EmployeeRepository employeeRepo;
	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepo.findAll();
	}

}
