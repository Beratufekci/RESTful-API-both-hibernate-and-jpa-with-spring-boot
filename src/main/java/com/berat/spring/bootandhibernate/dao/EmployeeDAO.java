package com.berat.spring.bootandhibernate.dao;

import java.util.List;

import com.berat.spring.bootandhibernate.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);

}
