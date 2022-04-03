package com.constructors;

public class Employee {
	//Variable declaration
	String emp_name;
	int emp_age;
	
	//Variable initialization
	public Employee (String name, int age ){
		this.emp_name=name;
		this.emp_age=age;
		System.out.println("Constructor is called and variables are initialised.");
	}
	
	//Variable usage1 inside a method
	public void printmethod() {
		System.out.println("Employee Name : "+ emp_name);
		System.out.println("Employee Name : "+ emp_age);

	}
	
	//Main Method
	public static void main (String[]args) {
		
		Employee ep = new Employee ("Abhishek", 35);
		ep.printmethod();
		System.out.println("Second usage, Employee Name : "+ ep.emp_name+ " | Employee Age : "+ ep.emp_age );
	}
}
