package com.example.Crud.Service;

import java.util.List;

import com.example.Crud.Model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);


}
