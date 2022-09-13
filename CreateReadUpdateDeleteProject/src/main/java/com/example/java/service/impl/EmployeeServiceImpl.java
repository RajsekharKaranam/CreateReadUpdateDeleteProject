package com.example.java.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.java.domain.Employee;
import com.example.java.repository.EmployeeRepository;
import com.example.java.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getEmployee() {
		System.out.println("getting data from db");
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}

	@Override

	public Optional<Employee> getById(Integer id) {
		return employeeRepository.findById(id);

	}

	@Override
	public Employee updateEmp(Employee emp, int id) {

		return employeeRepository.save(emp);

	}

	@Override
	public void deleteEmp(int id) {

		employeeRepository.deleteById(id);

	}

	public void deleteEmp(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.delete(employee);

	}

	public Optional<Employee> findEmployeById(Integer id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id);
	}

	@Override
	public Optional<Employee> findEmployeById(int i) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
