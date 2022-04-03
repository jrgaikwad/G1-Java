package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws1 {
	
	public static void m1() throws FileNotFoundException, InterruptedException {
		
		FileInputStream fil = new FileInputStream ("f:/abc.txt");
		Thread.sleep(1000);
		}
	 public static void main(String[] args) throws FileNotFoundException, InterruptedException	    {	
		 m1();
	
	 }	
}
