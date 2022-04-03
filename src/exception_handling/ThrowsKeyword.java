package exception_handling;

public class ThrowsKeyword {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Welcome");
		// System.out.println(10/0);   //Unchecked type exception : ArithmeticException
		// int arr[]= {1,2,3};          
		// System.out.println(arr[3]);	  //Unchecked type exception :IndexOutOfBoundsException
		
		Thread.sleep(1000);   //Checked exception handled using throws InterruptedException at declaration
		
		
		
		System.out.println("End of program");
	}

}
