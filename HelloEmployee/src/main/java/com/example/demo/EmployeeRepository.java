package com.example.demo;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository("empRepo")
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
