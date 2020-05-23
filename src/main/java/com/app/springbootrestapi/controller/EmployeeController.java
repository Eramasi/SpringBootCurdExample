package com.app.springbootrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.springbootrestapi.entity.Employee;
import com.app.springbootrestapi.service.EmployeeService;


@RequestMapping("employee")
@RestController
public class EmployeeController {
	
	@Autowired 
	private EmployeeService employeeservice;
	
	@PostMapping("save")
	public Employee save(@RequestBody Employee employee)
	{
		return employeeservice.saveEmployee(employee);
	}
	
	@PutMapping("update")
	public Employee update(@RequestBody Employee employee)
	{
		return employeeservice.updateEmployee(employee);
	}
	
	@GetMapping("all")
	public List<Employee> getAllEmployee()
	{
		return employeeservice.getAllEmployeeList();
	}
	
	
	
	
	
	
}
