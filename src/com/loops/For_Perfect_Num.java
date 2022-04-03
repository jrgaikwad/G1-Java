package com.loops;

import java.util.Scanner;

public class For_Perfect_Num {

	public static void main(String[]args) {
		Scanner fc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = fc.nextInt();
		int sum=0;
		for (int i=1; i<num;i++) {
			if(num%i==0) {
				System.out.println(i);
				sum=sum+i;
			}
			}
		if(sum==num) {
			System.out.println("Entered Number : "+ num + ", is a Perfect Number");
		}
		else {
			System.out.println("Entered Number : "+ num + ", is not a Perfect Number");

		}
	fc.close();
	}
}
