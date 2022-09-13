package com.example.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.java.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
	

}
