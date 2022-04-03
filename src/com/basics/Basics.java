package com.basics;

public class Basics {
	String meal;
	String menu;
	int persons;
	
	public void eating () {
		System.out.println(menu +" "+ meal +" menu was arranged for " + persons+ " people");
		
	}

	public static void main(String[] args) {

	Basics j= new Basics ();
	j.meal="Dinner";
	j.menu="Non-veg";
	j.persons=7;
	
	j.eating ();
			
	
	}

}
