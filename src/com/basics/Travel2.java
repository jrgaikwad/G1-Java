package com.basics;

public class Travel2 {
	
	String Vehicle;

	
	public void Journey() {
		System.out.println("Welcome to Longdrive Journey");
		System.out.println("Vehicle type: "+ Vehicle);
	}
	
	public void main (String[] args) {
		Travel2 t= new Travel2 ();
		
		t.Vehicle=" 2 Wheeler";
		
		
	t.Journey();
		
				
	}
}
