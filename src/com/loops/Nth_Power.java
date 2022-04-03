package com.loops;

import java.util.Scanner;

public class Nth_Power {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();
		int temp=num;
		int pow=1;
		int len=0;
		while (temp!=0) {
			len++;
			temp/=10;
			}
		System.out.println("Length is :"+ len);
		for (int i=1;i<=len;i++) {
			pow= pow*num;
		}
		System.out.println(num +" power "+ len +" is : "+pow);
	sc.close();
	}


}
