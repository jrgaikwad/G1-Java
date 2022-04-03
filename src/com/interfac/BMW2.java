package com.interfac;

public class BMW2 extends BMW implements Interface_SUV, Interface_Vehicle{

	public static void main(String[] args) {
		BMW2 obj= new BMW2();
		obj.acceleration();
		obj.breaking();
		obj.cost();
		obj.safety();
		Interface_SUV.veh_type();
		
	}

	@Override
	public void acceleration() {
		
		System.out.println("BMW2 has high Acceleration and its speed is :"+ speed);
		
	}

	@Override
	public void breaking() {
		
		System.out.println("BMW2 has anti-breaking system");
	}

	@Override
	public void cost() {

		System.out.println("Cost of BMW2 is High");
	}

}
