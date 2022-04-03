package com.basics;

public class Lecture {
	
	char Div;
	String Subject;
	short duration;
	long attendence;
	
	public void period() {
		System.out.println("Lecture details of "+ Div + " division:");
		System.out.println("Subject: "+ Subject + " |  Duration: " +  duration+ " Hour"+ " | Attendence: " + attendence);
	
	}
	
	public static void main (String [] args) {
	Lecture L= new Lecture ();
	L.Div = 'A';
	L.Subject="Thermodynamics";
	L.duration= 1;
	L.attendence= 64;
	
	L.period();
	
	
	

	}
	

}
