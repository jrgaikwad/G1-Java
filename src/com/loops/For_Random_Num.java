package com.loops;

import java.util.Random;

public class For_Random_Num {
	public static void approach1() {
		System.out.println("First 5 Random Number in 0 to 100 : ");
		for (int i=1; i<=5;i++) {
		Random rd = new Random();
		int ran_num= rd.nextInt(101);
		System.out.println(ran_num);
		}
	}
	
	public static void approach2() {
		
	}
	
	public static void main(String[] args) {
	    System.out.println("Random numbers through static method call:");
		approach1();
	}
	
}
