//package com.example.java.service;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.util.Optional;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import com.example.java.domain.Employee;
//import com.example.java.repository.EmployeeRepository;
//
//
//@SpringBootTest
//public class EmployeeServiceTest {
//	@Autowired
//	private EmployeeService employeeService;
//	@MockBean
//	private EmployeeRepository employeeRepository;
//
//	@Test
//	public void getEmployeeTest() {
//		when(employeeRepository.findAll()).thenReturn(Stream
//				.of(new Employee(1, "raj", null, null, null, 24, "eluru", null, null, null),
//						new Employee(2, "sekhar", null, null, null, 24, "eluru", null, null, null))
//				.collect(Collectors.toList()));
//		assertEquals(2, employeeService.getEmployee().size());
//	}
//
//
//	@Test
//	public void testFindEmployeById() {
//        Optional<Employee> emp=Optional.ofNullable(new Employee(0, null, null, null, null, 0, null, null, null, null));
//        Integer id =1;
//        emp.get().setId(id);
//        when(employeeRepository.findById(1)).thenReturn(emp);
//         emp = employeeService.findEmployeById(id);  
//        assertEquals(emp,employeeService.findEmployeById(id));
//	}
//
//	@Test
//	public void saveEmployeeTest() {
//		Employee employee = new Employee(1, "raj", null, null, null, 24, "eluru", null, null, null);
//		when(employeeRepository.save(employee)).thenReturn(employee);
//
//		assertEquals(employee, employeeService.saveEmployee(employee));
//	}
//
//	@Test
//	public void updateEmpTest() {
//		int id = 1;
//		Employee employee = new Employee(1, "raj", null, null, null, 24, "eluru", null, null, null);
//	when(employeeRepository.save(employee)).thenReturn(employee);
//
//		assertEquals(employee, employeeService.updateEmp(employee, id));
//	}
//
//	@Test
//	public void deleteEmpTest() {
//		Employee employee = new Employee(1, "raj", null, null, null, 24, "eluru", null, null, null);
//		employeeService.deleteEmp(employee);
//		verify(employeeRepository, times(1)).delete(employee);
//
//	}
//}
