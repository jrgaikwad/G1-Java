package com.casting;

public class ClassB extends ClassA {
	public void m3() {
		System.out.println("m3 method of ClassB");
	}
	public void m4() {
		System.out.println("m4 method of ClassB");
	}
	public static void main(String[] args) {
ClassA ref=new ClassB();
		
		ref.m1();
		ref.m2();
		
		
		
		//Down casting --though compiled program we will get runtime exception
		ClassB newRef=(ClassB)ref;
		
		newRef.m3();
		
		//down casting-get the compile error
		//ClassB newRef=new ClassA();
	}

}
