package com.jasearce.krugeremployeemanagement.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jasearce.krugeremployeemanagement.exceptions.ResourceNotFoundException;
import com.jasearce.krugeremployeemanagement.model.Employee;
import com.jasearce.krugeremployeemanagement.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@RequestMapping(value = "/employees", method = RequestMethod.POST)
	public Employee createEmployee(@Valid @RequestBody Employee employee) {
		return empService.createEmployee(employee);
	}
	
	@RequestMapping(value = "/employees", method =  RequestMethod.GET)
	public List<Employee> getAllEmployees(){
		return empService.getEmployees();
	}
	
	@RequestMapping(value = "employees/{empId}", method = RequestMethod.GET)
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "empId") Long employeeId) throws ResourceNotFoundException {
		Employee emp = empService.getEmployeeById(employeeId);
		if (emp == null) {
			throw new ResourceNotFoundException("Employee not found for this id :: " + employeeId);
		}
		return ResponseEntity.ok().body(emp);
	}
	
	@RequestMapping(value = "/employees/{empId}", method = RequestMethod.PUT)
	public ResponseEntity<Employee> updateEmployeeById(@PathVariable(value = "empId") Long id, @Valid @RequestBody Employee empDetails) throws ResourceNotFoundException {
		Employee emp = empService.getEmployeeById(id);
		if(emp == null) {
			throw new ResourceNotFoundException("Employee not found for this id :: " + id);
		}
		return ResponseEntity.ok(empService.updateEmployee(id, empDetails));
	}
	
	@RequestMapping(value="/employees/{empId}", method=RequestMethod.DELETE)
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "empId") Long employeeId) throws ResourceNotFoundException {
		Employee emp = empService.getEmployeeById(employeeId);
		if (emp == null) {
			throw new ResourceNotFoundException("Employee not found for this id :: " + employeeId);
		}
		empService.deleteEmployee(employeeId);
		Map<String, Boolean> deleteResponse = new HashMap<>();
		deleteResponse.put("deleted", Boolean.TRUE);
		return deleteResponse;
	}
	

}
