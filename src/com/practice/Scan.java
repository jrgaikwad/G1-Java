package com.practice;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Number: ");
		int a = sc.nextInt();
		System.out.println("No is: "+a);
		sc.close();
	}
}
