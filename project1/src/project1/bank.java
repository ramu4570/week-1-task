package project1;

public class bank {
	double balance = 5000;
	void main(String[] args) {
		checkbalance();
		deposit(2000);
		withdraw(3000);
	}
	void checkbalance() {
		System.out.println("checkbalance:" +balance);
	}
	
	void deposit (double amount) {
		balance = balance + amount;
		checkbalance();
	}
	void withdraw(double amount) {
		balance = balance - amount;
		checkbalance();
		System.out.println("main method ended");
	}
	
	
}
