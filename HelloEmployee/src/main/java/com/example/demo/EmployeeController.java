package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	@GetMapping("/home")
	public String home() {
		return "Hello from home";
	}
	
	@GetMapping("/employee/list")
	public List<Employee> getAll(){
		return empService.getAll();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmp(@PathVariable int  id) {
		return empService.getEmp(id);
	}
}
