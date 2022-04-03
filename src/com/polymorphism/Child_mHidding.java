package com.polymorphism;

public class Child_mHidding extends Parent_mHidding {
	
	public static void m1() {
		System.out.println("Child Static Methods");
	}

	public static void main(String[] args) {

		Parent_mHidding var = new Child_mHidding();
		var.m1();
	}

}
