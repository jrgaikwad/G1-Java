package com.logicbuiding;

public class Num_len {

	public static void main(String[] args) {
		
		int num=56285;
		int len =0;
		
		while (num%10!=0) {
			len+=1;
			
			num=num/10;
			
		}
		System.out.println("Length is : "+len);
	}

}
