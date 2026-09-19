package project1;

public class bankaccountcalcution {

	public static void main(String[] args) {
		
		System.out.println("welcome to bank");
		
		bankaccountabs sa = new savingaccount();
		
		sa.deposite(2000.00);
		sa.withdraw(15000);     
	}
}
