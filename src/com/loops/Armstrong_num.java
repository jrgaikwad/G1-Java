package com.loops;

import java.util.Scanner;

public class Armstrong_num {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();
		int temp=num;
		int pow=1;
		int arm=0;
		int len=0;
		while (temp!=0) {
			len++;
			temp/=10;
			}
		System.out.println("Length is :"+ len);
		
		temp=num;
		while(temp%10!=0) {
			int rim = temp%10;
		for (int i=1;i<=len;i++) {
			pow= pow*rim;
		}
			arm=arm+pow;
			num=num/10;
		}
		if (arm==num) {
			System.out.println(num + " is a Armstrong Number");
			
		}
		else {
			System.out.println(num + " is Not a Armstrong Number");

	}

		sc.close();
	}
}
