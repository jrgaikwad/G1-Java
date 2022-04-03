package com.practice;
public class LocalVariable {

	//Class Level declaration
     static int x;
	
	public static void main(String[] args) {

	 System.out.println("Class level Variable-value of x " + x);
  
	//local variable
	 int x=10;
	 
	 LocalVariable.x=x;
	 
	 System.out.println("After Assignment-Value of x " + LocalVariable.x);

	
	}

}