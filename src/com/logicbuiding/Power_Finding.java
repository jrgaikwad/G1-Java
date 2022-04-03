package com.logicbuiding;

import java.util.Scanner;

public class Power_Finding {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Value of Base Number :");
		int x= sc.nextInt();
		
		System.out.println("Enter Value of Power Term :");
		
		int y=sc.nextInt();
		int val=1;
		for (int i=1;i<=y;i++) {
			val=val*x;
		}
		
		System.out.println(x+ " ^ "+y+ " = " +val);
	sc.close();
	}

}
