//this_to access the current class instance
package com.constructors;

public class C1 {
	int a;
	int b=10;
	public C1(int a, int b){
		this(10);
		this.a=a;
		b=this.b;
		int c=a+b;
		System.out.println("This is a integer type constructor, c= a +b: "+c);
		
	}
	 public C1(char c){
		 System.out.println("This constr accept char & Char is : "+c);
	 }
	 public C1(int a){
			
			this('A');
			this.a=a;
			System.out.println("This is a integer type constructor, c= a +b: "+a);
			
		}
	 
	
	 public static void main(String[]args) {
		new C1(10,30);
}
}