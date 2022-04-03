package com.loops;

import java.util.Scanner;

public class While_Len {
	
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number Whoose Length to be Found Out:");
		long num = sc.nextInt();
		int len=0;
		while (num!=0) {
			num=num/10;
			len++;
		}
		System.out.println("Length is: "+ len);
	
	sc.close();
	}

}
