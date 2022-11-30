package com.jasearce.krugeremployeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jasearce.krugeremployeemanagement.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
