package com.string;

public class StringMethods {

	public static void main(String[] args) {
		
		String s= "Welcome";
		String s2= "Ram";
		System.out.println(s.length());
		System.out.println(s.indexOf("Ram"));
		System.out.println(s.concat(s2));
		System.out.println(s.concat("Sham"));
		
		//Special Characters Because strings must be written within quotes, Java will misunderstand this string, and generate an error:
		//The solution to avoid this problem, is to use the backslash escape character.The backslash (\) escape character turns special characters into string characters:
		
		String txt = "We are the so-called \"Vikings\" from the north.";
		System.out.println(txt);
		
		String greet="HappyHoli";
		System.out.println(greet.substring(5,9));
		
		System.out.println(greet.replace('H', 'P'));
		
		System.out.println(greet.replace("Holi","Birthday"));

	}

}
