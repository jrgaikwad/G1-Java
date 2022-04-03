package com.practice;

public class Local2SatviaMethod {
	static int a;
	
	//Static Method
	public static int passvalue(int a, int b) {
		int c= a+b;
		System.out.println("Passvalue is: "+ c);
		return c;
		}
	public static void main(String[] args)
	{
		a=passvalue(15,20);
		System.out.println("Value of Static Variable: "+ a);
			}
	
}
