package com.practice;

public class Call_Method_Outside_Class {

	public static void main(String[] args) {
		
		//Calling Static Method outside Class
		Methods.method2();
		
		//Calling Instance Method outside Class
		
		//For that we need to create object of that class
		Methods a1 = new Methods();
		
				a1.method1();
	
	}
}
