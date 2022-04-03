package com.loops;

import java.util.Scanner;

public class No_Length {
	
	public static void main(String[]args) {
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a number whoose length is to find: ");
	int num= sc.nextInt();
	int len = 0;
	
	while (num!=0) {
		len = len+1;
		num=num/10;
		
	}
	System.out.println("Length of the entered no is : "+ len);
	
	sc.close();
	}
	
		}
