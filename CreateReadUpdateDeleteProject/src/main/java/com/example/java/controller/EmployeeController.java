package com.example.java.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.java.domain.Employee;
import com.example.java.service.EmployeeService;

@RestController

public class EmployeeController {
	Logger logger = org.slf4j.LoggerFactory.getLogger(EmployeeController.class);
	@Autowired
	EmployeeService employeeService;

	@GetMapping(value = "/getEmployee")
	public List<Employee> getEmployee() {

		String a = "abc";
		try {
			logger.info("[ getEmployee] info message:");
			if (a.contentEquals("abc")) {

			}
		} catch (Exception e) {
			logger.error("Exception at End Point 'message' :" + e.getMessage());
			if (logger.isDebugEnabled()) {
				e.printStackTrace();
			}
		}

//		logger.warn("[ getEmployee] warn message");
//		logger.error("[ getEmployee] error message");
//		logger.debug("[ getEmployee] debug message");
//		logger.trace("[ getEmployee] trace message");
		return employeeService.getEmployee();
	}

	@PostMapping(value = "/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		
		String a = "abc";
		try {
			logger.info("[ saveEmployee] info message");
			if (a.contentEquals("abc")) {

			}
		} catch (Exception e) {
			logger.error("Exception at End Point 'message' :" + e.getMessage());
			if (logger.isDebugEnabled()) {
				e.printStackTrace();
			}
		}
//		logger.warn("[ saveEmployee] warn message");
//		logger.error("[ saveEmployee] error message");
//		logger.debug("[ saveEmployee] debug message");
//		logger.trace("[ saveEmployee] trace message");
		return employeeService.saveEmployee(employee);
	}

	@GetMapping(value = "/getEmployee/{id}")
	public Optional<Employee> getEmployee(@PathVariable Integer id) {
		
		String a = "abc";
		try {
			logger.info("[ getEmployee By Id ] info message");
			if (a.contentEquals("abc")) {

			}
		} catch (Exception e) {
			logger.error("Exception at End Point 'message' :" + e.getMessage());
			if (logger.isDebugEnabled()) {
				e.printStackTrace();
			}
		}
//		logger.warn("[ getEmployee By Id] warn message");
//		logger.error("[ getEmployee By Id] error message");
//		logger.debug("[ getEmployee By Id] debug message");
//		logger.trace("[ getEmployee By Id] trace message");

		return employeeService.getById(id);
	}

	@PutMapping(value = "/{id}")
	public Employee UpdateEmployee(@PathVariable Integer id, @RequestBody Employee emp) {
		
		String a = "abc";
		try {
			logger.info("[ updateEmployee] info message");
			if (a.contentEquals("abc")) {

			}
		} catch (Exception e) {
			logger.error("Exception at End Point 'message' :" + e.getMessage());
			if (logger.isDebugEnabled()) {
				e.printStackTrace();
			}
		}
//		logger.warn("[ updateEmployee] warn message");
//		logger.error("[ updateEmployee] error message");
//		logger.debug("[ updateEmployee] debug message");
//		logger.trace("[ updateEmployee] trace message");
		return employeeService.updateEmp(emp, id);
	}

	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int id) {
		
		String a = "abc";
		try {
			logger.info("[ deleteEmployee] info message");
			if (a.contentEquals("abc")) {

			}
		} catch (Exception e) {
			logger.error("Exception at End Point 'message' :" + e.getMessage());
			if (logger.isDebugEnabled()) {
				e.printStackTrace();
			}
		}
//		logger.warn("[ deleteEmployee] warn message");
//		logger.error("[ deleteEmployee] error message");
//		logger.debug("[ deleteEmployee] debug message");
//		logger.trace("[ deleteEmployee] trace message");
		employeeService.deleteEmp(id);
		return new ResponseEntity<String>("Employee Deleted Successfully", HttpStatus.OK);
	}

}
