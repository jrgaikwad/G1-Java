package encapsulation;

public class ATM {
	
	public static void welcome() {
		System.out.println("Welcome to ICICI Bank ATM");
	}
	public static void main(String[] args) {
		
		//Parent object
		BankAcc p = new BankAcc ();
		welcome();
		//to display current balance using getter method
		System.out.println("Current Acc Balance is : "+ p.get_bal(234562) );
		
		//to Set/modify balance using Setter method
		p.set_bal(5000);
		
		//to display updated balance using getter method
		System.out.println("Updated Acc Balance is : "+ p.get_bal(234562) );

		
	}

}
