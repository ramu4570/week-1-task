package project1;

public class bankaccountget {

	public static void main(String[] args) {
		
		bankaccountset ba = new bankaccountset();
		ba.setaccountnumber(167892037);
		ba.setholdername("sri");
		ba.setbalance(5000);
		
		ba.deposit(2000.00);
		ba.withdraw(1500);
		
		System.out.println("account number:"+ba.getaccountnumber());
		System.out.println("holder name:"+ba.getholdername());
		System.out.println("deposit amount"+ba.deposit);
		System.out.println("withdraw amount"+ba.withdraw);
		System.out.println("total balance:"+ba.getbalance());

	}

}
