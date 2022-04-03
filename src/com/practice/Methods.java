package com.practice;

public class Methods {

		//Instance variable
		int b=20;
		//Static Variable
		static int a=10;
		
		
		//instance method
		public void method1() {
			System.out.println("This is instance type method");
			System.out.println("instance  variable in instance method -" + b);
			
		}
		
		
		//Static method
		public static void method2() {
					System.out.println("This is Static type method");
					
					System.out.println("staic variable in static method -" + a);					
				}
		
		public static void main(String [] args) {
			
			//creation of object
			Methods t1=new Methods();
			
			//calling instance type of method
			t1.method1();
			
			//calling Static type of method
			method2();
		
		}

	}