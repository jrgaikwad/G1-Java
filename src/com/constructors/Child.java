package com.constructors;

public class Child extends Parent {

	public Child() {
		this(10);
		System.out.println("This is Child Class Constructor");
	}
	public Child(int a) {
		super(12);
		System.out.println("This is Child Class int Arument Constructor");
	}
	
	
	public static void main(String[] args) {
		
		Parent c= new Child ();

		
		

	}

}
