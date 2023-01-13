package spring.rest.consumer.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.rest.consumer.demo.client.EmpClient;
import spring.rest.consumer.demo.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmpClient empClient;

	public List<Employee> getAllEmployees() {
		return empClient.getAllEmps();
	}

	public Employee getEmployeeById(int employeeId) {
		return empClient.getEmpById(employeeId);
	}

	public String hello() {
		return empClient.hello();
	}
}
