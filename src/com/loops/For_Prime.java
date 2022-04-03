package com.loops;

import java.util.Scanner;

public class For_Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		int counts = 0;
		for (int i=1; i<=num; i++) {
			if (num%i==0) {
				counts++;
			}
		}
			if (counts>2) {
			System.out.println(num+ " is not prime number");
		}
			else {
			System.out.println(num+" is Prime number");
			}
			sc.close();
			}
			
	}
