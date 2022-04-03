package com.constructors;

public class SubC extends SuperC {

	public SubC() {
		System.out.println("Child Constructor");
	}
	public static void main(String[] args) {
	
		SubC c= new SubC(10);	
	}

}
