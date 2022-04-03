package exception_handling;

public class AEexcep {

	public static void main(String[] args) {
		
		String s="12345";
		Integer i=Integer.parseInt(s);
		System.out.println(i);
		System.out.println(i+10);
		
		String s1= new String("Jeevan");
		
		System.out.println(s1.contains("san"));
		
		
		
		String s2= new String("Jeevan");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);

		String name="VelocityCorporate";
		System.out.println(name.length());
		System.out.println(name.substring(8,17));
		

		
		
		
//		int i=10;
//		
//		try {
//		for (int j=3; j>=0; j--) {
//			System.out.println(i/j);
//		}
//		}
//		catch (Exception e) {
//			System.out.println(e);
//			System.out.println(e.getMessage ());
//
//			System.out.println(e.getClass ());
//			
//		}
//		finally {
//			System.out.println("End of Program");
//		}
	}

}
