package com.loops;

import java.util.Scanner;

public class While_Table_Printing {
	
	public static void main (String [] args) {
		System.out.println("Enter a Number: ");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
			int table;
		for (int i=1;i<=10;i++) {
			table= num*i;
			System.out.println(i +"*"+ num +" = "+ table);

		}
		sc.close();
	}

}
