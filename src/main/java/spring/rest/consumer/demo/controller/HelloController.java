package spring.rest.consumer.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.rest.consumer.demo.service.EmployeeService;

@RestController
public class HelloController {

	@Autowired
	private EmployeeService empService;

	@GetMapping("/hello")
	public String hello() {
		return empService.hello();
	}

}
