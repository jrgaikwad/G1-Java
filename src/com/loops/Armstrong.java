package com.loops;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive number : ");
		int ori_num=sc.nextInt();

		int num=ori_num;
		int sum=0;
		int arm=0;
		int rim; 
		int len=0;
		
		while(num!=0) {
			len++;
			num=num/10;
		}
		System.out.println("Length of entered number : "+len);
		
		num=ori_num;
		
		while(num!=0) {
			rim=num%10;
		   
			sum += Math.pow(rim, len);
			
			num=num/10;
		}

		if (sum==ori_num) {
			System.out.println(ori_num + " is a Armstrong Number");
			
		}
		else {
			System.out.println(ori_num + " is Not a Armstrong Number");

	}

		sc.close();
	}
}