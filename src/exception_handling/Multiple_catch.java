package exception_handling;

public class Multiple_catch {
	public static void main(String[] args) {


		System.out.println("Hi");
		System.out.println("How are you");
		String s=null;
		
		try {
			System.out.println("in try block");
			s.equals("hi");
		}
		catch (NullPointerException e) {
			System.out.println(e.getClass());
		}
		catch (ArithmeticException e) {
			System.out.println(e.getClass());
		}
		
		catch (RuntimeException e) {
			System.out.println(e.getClass());
		}
		catch (Exception e) {
			System.out.println(e.getClass());
		}
		finally {
			System.out.println("In finally block");
		}
		System.out.println("I am fine");
	}
}
