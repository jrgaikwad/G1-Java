package com.constructors;

public class C3 {
	
	int x;
	public C3(int val) {
		this();
		this.x=val;
		System.out.println("int argument constr"+x);
	}
	public C3 (float f) {
		this(10);
		System.out.println(" Float argument constr"+f);
	}
	public C3 (){
		System.out.println("Zero argument constr");
		
	}
	public static void main(String[] args) {
		C3 var= new C3 (12.24f);
	}
}
