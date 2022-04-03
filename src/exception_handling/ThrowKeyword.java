package exception_handling;

public class ThrowKeyword {
	
public static  void canVote(int age)  {
	
		if (age<18) 
			try {
				throw new Exception();
			}
		catch (Exception e) {
			System.out.println(e);
			System.out.println("You are not Adult!!!, You can't cast Vote");
		}
		
		else {
			System.out.println("You can cast Vote!!!");
		}
			}

	public static void main(String[] args)  {
		System.out.println("Welcome");
		System.out.println("First Person");	
		canVote(10);
		
		System.out.println("Second Person");
		canVote(20);

		
		System.out.println("End of Program");

	}


}
