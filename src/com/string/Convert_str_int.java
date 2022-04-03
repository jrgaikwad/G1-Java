package com.string;

public class Convert_str_int {

	public static void main(String[] args) {
		
//		int ii = 12345;
//		
//		String ss = String.valueOf(ii);
//		System.out.println(ii+10);
//		System.out.println(ss+10);
		
		String s="12345";
		Integer i=Integer.parseInt(s);
		
		System.out.println("Value of i-" + i);
		String value=String.valueOf(i);
		System.out.println(value+10);		
		

	}

}
