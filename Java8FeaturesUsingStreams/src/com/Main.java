package com;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		EmployeeRepository employeeRepository = new EmployeeRepository();
		
		EmployeeService employeeService = new EmployeeService(employeeRepository);
		
		
		List<Employee> employeeList =  employeeService.getEmployee();
		
		//employeeList.forEach(employee ->System.out.println(employee));
		
		
		
		employeeService.filterBySalary(50000).forEach(employee->System.out.println(employee));;
		
		
		
		employeeService.displayEmployeeDetails();
		
		
		employeeService.getAllEmployeeEmails().forEach(System.out::println);
		
		System.out.println("======Employee id  by filter=======");
		
		try
		{
		System.out.println(employeeService.getEmployeeById(3));
		}
		catch(EmployeeNotFounException ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}

}
