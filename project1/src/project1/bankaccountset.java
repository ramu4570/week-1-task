package project1;

public class bankaccountset {
	private long accountnumber;
	private String holdername;
	private double balance;
	
	public double deposit;
	public double withdraw;
	//setters
	public void setaccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	
	public void setholdername(String holdername) {
		this.holdername = holdername;
	}
	
	public void setbalance(double balance) {
		this.balance= balance;
	}
	//methods two
	public void deposit(double deposit) {
		this.deposit = deposit;
		balance = balance+ deposit;
	}
	
	public void withdraw(double withdraw) {
		this.withdraw = withdraw;
		if(withdraw<=balance) {
			balance = balance-withdraw;
		}else {
			System.out.println("insufficient balance");
		}
	}
	
	//getters
	public long getaccountnumber() {
		return accountnumber;
	}
	public String getholdername() {
		return holdername;
	}
	public double getbalance() {
		return balance;
	}
}
