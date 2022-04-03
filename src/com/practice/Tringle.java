package com.practice;

public class Tringle {
	
	protected void m1() {
		System.out.println("m1 method of Tringle");
	}
	
	public static void main(String[]args) {
		for (int row=1; row<=5;row++) {
			for (int col_space=5; col_space>=row;col_space--) 
				System.out.print(" ");
			
			for (int col_star=1; col_star<=row; col_star++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
