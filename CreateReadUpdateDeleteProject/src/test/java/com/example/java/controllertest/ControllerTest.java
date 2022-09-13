//package com.example.java.controllertest;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.Mockito.when;
//
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import com.example.java.controller.EmployeeController;
//import com.example.java.domain.Employee;
//import com.example.java.service.impl.EmployeeServiceImpl;
//
//@SpringBootTest
//public class ControllerTest {
//	Employee employee;
//
//	@MockBean
//	EmployeeServiceImpl employeeServiceImpl;
//
//	@Autowired
//	public EmployeeController employeeController;
//
//	@Test
//	@DisplayName("Employee controller running")
//
//	public void testGetEmployee() {
//
//		when(employeeController.getEmployee()).thenReturn(Stream.of(employee).collect(Collectors.toList()));
//		assertThat(employee);
//	}
//
//	@Test
//	public void testsaveEmployee() {
//
//		// when(employeeController.saveEmployee(employee))
//		// .thenReturn(employee);
//		assertThat(employee).isEqualTo(employeeController.saveEmployee(employee));
//	}
//
//	@Test
//	public void testGetEmployeeById() {
//	
//		employeeController.getEmployee();
//		when(employeeController.getEmployee()).thenReturn(Stream.of(employee).collect(Collectors.toList()));
//		assertThat(employee);
//	}
//}