package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeRepository {

	
	private List<Employee> employeeList;
	
	
	public EmployeeRepository()
	{
		
		this.employeeList = new ArrayList<>();
		

	        employeeList.add(new Employee(1, "Ravi", "ravi@gmail.com", "IT", 50000, 25));
	        employeeList.add(new Employee(2, "Priya", "priya@gmail.com", "HR", 45000, 28));
	        employeeList.add(new Employee(3, "Amit", "amit@gmail.com", "Finance", 60000, 30));
	        employeeList.add(new Employee(4, "Sneha", "sneha@gmail.com", "IT", 55000, 27));
	        employeeList.add(new Employee(5, "Rahul", "rahul@gmail.com", "Sales", 40000, 26));
	        employeeList.add(new Employee(6, "Anjali", "anjali@gmail.com", "Marketing", 48000, 29));
	        employeeList.add(new Employee(7, "Kiran", "kiran@gmail.com", "IT", 70000, 32));
	        employeeList.add(new Employee(8, "Pooja", "pooja@gmail.com", "HR", 42000, 24));
	        employeeList.add(new Employee(9, "Vikram", "vikram@gmail.com", "Finance", 65000, 35));
	        employeeList.add(new Employee(10, "Neha", "neha@gmail.com", "Sales", 39000, 23));
       
	}
	
	public List<Employee> getEmployees()
	{
		return this.employeeList;
	}
	
	
	public Optional<Employee> getEmployeeById(int id)
	{
		return this.employeeList.stream().filter(employee->employee.getId()==id).findFirst();

	}
	
}
