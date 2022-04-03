package com.basics;

public class Travel {
	
	String Vehicle;
	char route;
	short weight;
	int speed;
	boolean b;
	long totalrun;
	float average;
	double avg;
	byte persons;
	
	public void Journey() {
		System.out.println("Welcome to Longdrive Journey");
		System.out.println("Vehicle type: "+ Vehicle+ " | Route: "+ route+ " | Weight: "+weight+ "Kg | Speed: "+ "km/hr | Total Run: " + totalrun+ " km  | Average: "+ average+ "km/ltr | Exact Average: "+avg+" km/ltr | Persons: "+ persons+ " | True or False: "+ b );
	}
	
	public static void main (String[] args) {
		Travel t= new Travel ();
		
		t.Vehicle=" 2 Wheeler";
		t.route='A';
		t.weight= 100;
		t.speed= 65;
		t.b= true;
		t.totalrun= 2456158;
		t.average = 50;
		t.avg= 50.8645424442;
		t.persons= 2;
		
	t.Journey();
		
				
	}
}
