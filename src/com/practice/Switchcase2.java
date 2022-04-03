package com.practice;

import java.util.Scanner;

public class Switchcase2 {
	
	
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First Three letters of Month between Jan to May with first letter capital :");
	
	String x = sc.nextLine();
	
	switch (x) {
	case "Jan": System.out.println("It is the First Month of Year");
	break;
	case "Feb": System.out.println("It is Second Month of the Year");
	break;
	case "Mar": System.out.println("It is Third Month of the Year");
	break;
	case "Apr": System.out.println("It is Fourth Month of the Year");
	break;
	case "May": System.out.println("It is Fifth Month of the Year");
	break;
	default: System.out.println(" Enter Month between Jan to May");
	break;

	}
	sc.close();
	}

}
