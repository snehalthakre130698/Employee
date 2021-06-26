package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("empService")
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepo;
	
	public List<Employee> getAll(){
		return empRepo.findAll();
	}
	
	public Employee getEmp(int id) {
		return empRepo.getById(id);
	}

}
