package encapsulation;

public class BankAcc {
	//data member
	private double balance = 20000;
	
	//getter method to know balance
	public double get_bal(int accNo) {
		return balance;
	}
	
	//setter method to update balance
	public void set_bal(double add_amount) {
		balance-= add_amount;
	
	}

}
