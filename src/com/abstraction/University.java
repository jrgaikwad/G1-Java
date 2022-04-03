package com.abstraction;

public abstract class University {
	public University () {
		System.out.println("abstract class constructor");
	}
	
	public abstract void department();
	
	
	public void Mechanical() {
		System.out.println("Mechanical Engineeering Department");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// University ab = new University(); //can't create object, gives compile time error
	}

}
