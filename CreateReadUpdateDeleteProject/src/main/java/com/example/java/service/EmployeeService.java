package com.example.java.service;

import java.util.List;
import java.util.Optional;

import com.example.java.domain.Employee;

public interface EmployeeService {

	List<Employee> getEmployee();

	public Employee saveEmployee(Employee employee);



	public Employee updateEmp(Employee emp, int id);

	public void deleteEmp(int id);

	Optional<Employee> getById(Integer id);

	Optional<Employee> findEmployeById(int i);

	void deleteEmp(Employee employee);




	

}
