package com.loops;

//import java.util.Scanner;

public class For_Multi_Table {
	
	public static void main(String[] args) {
		//System.out.println(" Enter a number whoose table is to be printed : ");
		//Scanner sc = new Scanner(System.in);		
		//int table=sc.nextInt();
		
		
		for (int j=5; j<=10; j++ ) {
		for (int i=1; i<=10; i++) {
			int c=i*j;
			System.out.print(" | "+ c);
		}
	System.out.println();
	//sc.close();
	}
	}
}

