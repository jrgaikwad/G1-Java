package com.basics;

public class Test1 {
	

	//Non-static or instance variable
	 double  rollNo;
	 String c;
	
	
    
	public static void main(String[] args) {
		
	
		Test1 t=new Test1();
		t.rollNo=15;
	
		System.out.println(t.rollNo);
		
		Test1 t1=new Test1();
		t1.rollNo=20;
		
		System.out.println(t1.rollNo);
		
		Test1 t3=new Test1();
		System.out.println(t3.rollNo);
		System.out.println(t3.c);
	

	}

	
	
}