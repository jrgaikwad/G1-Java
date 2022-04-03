package com.loops;

import java.util.Random;

public class Random_double_num {

	public static void main(String[] args) {
	    
		//to print double numbers
		System.out.println("Any 3 Random Double numbers are : ");
		for(int x=1; x<=3;x++) {
			Random rdd= new Random();
		
		double dbl= rdd.nextDouble();
		System.out.println(dbl);
		}
		
	}
}
