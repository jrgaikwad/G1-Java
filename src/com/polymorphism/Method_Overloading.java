package com.polymorphism;

public class Method_Overloading {
	
	public void sum(int a, int b) {
		int add =a+b;
		System.out.println("Addition of "+a+" + "+ b+" = "+add);
	}
	
	public void sum(int a, int b, int c) {
		int add =a+b+c;
		System.out.println("Addition of "+a+" + "+ b +" + "+ c+ " = "+add);
	}
	public static void main(String[] args) {

		Method_Overloading var = new Method_Overloading ();
		var.sum(5, 6);
		var.sum(7,8,5);
	}

}
