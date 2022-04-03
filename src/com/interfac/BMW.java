package com.interfac;

public class BMW implements Interface_Vehicle {
	public void safety() {
		System.out.println("BMW is a safe vehicle & speed is : "+speed);
	}
	public static void main(String[] args) {
		
		BMW var = new BMW (); 
		var.acceleration();
		var.safety();

	}

	@Override
	public void acceleration() {
		System.out.println("BMW has high Acceleration and its speed is :"+ speed);
		
	}

	@Override
	public void breaking() {
		// TODO Auto-generated method stub
		
	}

}
