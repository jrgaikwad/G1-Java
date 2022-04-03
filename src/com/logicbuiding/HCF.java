package com.logicbuiding;

import java.util.Scanner;

public class HCF {
	
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First Number :");
	int divident=sc.nextInt();
	System.out.println("Enter Second Number :");
	int divisor=sc.nextInt();
	int remainder, HCF;
	
	do {
		remainder= divident%divisor;
		if (remainder==0) {
			HCF=divisor;
			
		}
		else {
			divident=divisor;
			divisor=remainder;
			}
	}
	while (remainder!=0); {
		
		System.out.println("HCF = "+ divisor);
			
		}
	sc.close();
	}
	
	
	}

