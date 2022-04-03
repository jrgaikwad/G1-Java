package com.loops;

public class For_Pyramid {
	
	public static void main (String [] args) {
		
		//External Loop
		for(int row=1; row<7;row++) {
			
			//Internal Loop
			for (int col=1; col<=7; col++ ) {
				
				if (col<=row) {
				System.out.print(" # ");
				}
			
		}
			System.out.println();
	}
}
}
