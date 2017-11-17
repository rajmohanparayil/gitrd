package com.rjprd.gitrd.service;

public class EmployeeService {
	
	public void fetchAll(){
		System.out.println("Employee 1");
		System.out.println("Employee 2");

	}
	
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		employeeService.fetchAll();
	}

}
