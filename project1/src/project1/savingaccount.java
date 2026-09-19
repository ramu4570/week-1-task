package project1;

public class savingaccount extends bankaccountabs {
	double balance = 10000.00;

	@Override
	public void deposite(double amount) {
		hello();

		System.out.println("deposit amount is:" + amount);
		balance = balance + amount;

		checkbalance();
	}

	public void withdraw(double amount) {
		hello();
		
		System.out.println("withdraw amount is:" + amount);
		if (amount <= balance) {
			balance = balance - amount;
			checkbalance();
		} else {
			System.out.println("insufficient balance");
			checkbalance();
		}
	}

	public void checkbalance() {
		System.out.println("the current balance:" + balance);
	}

	@Override
	void hello() {
		System.out.println("good morning ");
	}

}
