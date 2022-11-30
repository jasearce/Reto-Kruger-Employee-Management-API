package com.jasearce.krugeremployeemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jasearce.krugeremployeemanagement.model.Employee;
import com.jasearce.krugeremployeemanagement.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepository;
	
	//CREATE
	public Employee createEmployee(Employee empl) {
		return empRepository.save(empl);
	}
	
	//READ
	public List<Employee> getEmployees(){
		return empRepository.findAll();
	}
	
	public Employee getEmployeeById(Long employeeId) {
		return empRepository.findById(employeeId).get();
	}
	
	//DELETE
	public void deleteEmployee(Long employeeId) {
		empRepository.deleteById(employeeId);
	}
	
	//UPDATE
	public Employee updateEmployee(Long empId, Employee employeeDetails) {
		Employee emp = empRepository.findById(empId).get();
		emp.setFirstName(employeeDetails.getFirstName());
		emp.setLastName(employeeDetails.getLastName());
		emp.setEmailId(employeeDetails.getEmailId());
		
		return empRepository.save(emp);
	}
}
