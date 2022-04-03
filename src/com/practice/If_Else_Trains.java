package com.practice;

public class If_Else_Trains {

	
	public static void main (String[] args) {
		
	int speed = 280;
	System.out.println("|| Welcome To Indian Railways ||");
	
	if (speed<50) {
		System.out.println("It is Local Train");
	}
	else if (speed>= 50 & speed< 100) {
		System.out.println("It is Express Train");
		
	}
	else if (speed >=100 & speed < 150) {
		System.out.println("It is Metro Train");
	}
	else {
		System.out.println(" It is Bullet Train");
	}
	}
}
