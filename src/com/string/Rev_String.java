package com.string;

public class Rev_String {

	public static void main(String[] args) {
		String s="Ahuja";
		String rev="";
		for (int i=s.length()-1; i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(s);
		System.out.println(rev);

	}

}
