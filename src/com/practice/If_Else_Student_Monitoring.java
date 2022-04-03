package com.practice;

public class If_Else_Student_Monitoring {
	
	static int per = 91;
	
	public static void main (String[] args) {
		
		System.out.println("Welcome to Student Monitoring System");
	
	if (per<35) {
		System.out.println("You are Failed");
	}
	
	else if (per>= 35 & per<50) {
		System.out.println("You are passed with 'C' Grade ");
	}
	
	else if (per>= 50 & per<75) {
		System.out.println(" You are passed with 'B' Grade");
			}
	
	else if (per>= 75 & per<85) {
		System.out.println("Congratualations!!!!! You are passed with 'A' Grade");
		
	}
	
	else {
		System.out.println("Congratualtions!!!!! You are passed with 'A+' Grade");
	}

}
}
