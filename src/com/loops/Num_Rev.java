package com.loops;

import java.util.Scanner;

public class Num_Rev {
	
	public static void main(String[]args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a number to reverse : ");
		int num=sc.nextInt();
		int rev=0;
		int rim;
		while(num%10!=0) {
			rim=num%10;
			rev=rev*10+rim;
			num=num/10;
		}
		System.out.println("Reverse is : "+rev);
	sc.close();
	}

}
