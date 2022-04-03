package com.practice;

import java.util.Scanner;

public class Swichcase {
	
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the nth day of week :");
	
	int x = sc.nextInt();
	
	switch (x) {
	case 1: System.out.println("Its Monday & It is a Weekday");
	break;
	
	case 2: System.out.println("Its Tuesday & It is a Weekday");
	break;
	
	case 3: System.out.println("Its Wednesday & It is a Weekday");
	break;
	
	case 4: System.out.println("Its Thursday & It is a Weekday");
	break;
	
	case 5: System.out.println("Its Friday & It is a Weekday");
	break;
	
	case 6: System.out.println("Its Saturday & It is a Holiday");
	break;
	
	case 7: System.out.println("Its Sunday & It is a Holiday");
	break;
	default: System.out.println("Enter a Valid day");
	}
	sc.close();
	}

}
