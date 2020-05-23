package com.app.springbootrestapi.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.springbootrestapi.dao.EmployeeDao;
import com.app.springbootrestapi.entity.Employee;
import com.app.springbootrestapi.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDao employeedao;

	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeedao.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return employeedao.saveAndFlush(employee);
	}

	@Override
	public List<Employee> getAllEmployeeList() {
		
		return employeedao.findAll();
	}

	@Override
	public Employee getEmployee(int employeeId) {
		
		return null;
	}

	@Override
	public void deleteEmployee(int employeeId) {
				

	}

}
