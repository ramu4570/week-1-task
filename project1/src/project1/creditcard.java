package project1;

public class creditcard extends payment{

	@Override
	void pay(double amount) {
		System.out.println("welcome to credit card payment");
		this.amount = amount;
		
		transationfee = amount *2/100;
		
		double totalamount = amount +transationfee;
		
		System.out.println("ur amount"+amount);
		System.out.println("transationfee"+transationfee);
		System.out.println("totalamount"+totalamount);
		System.out.println("payment Successful");
	}

}
class upi extends payment{

	@Override
	void pay(double amount) {
		System.out.println("welcome to upi payment");
		this.amount = amount;
		
		transationfee = amount *0 /100;
		
		double totalamount = amount + transationfee;
		System.out.println("ur amount"+amount);
		System.out.println("transationfee"+transationfee);
		System.out.println("totalamount"+totalamount);
		System.out.println("payment Successful");
	}
	
}
class netbanking extends payment{

	@Override
	void pay(double amount) {
		System.out.println("welcome to netbanking");
		this.amount =amount;
		transationfee = 10;
		double totalamount = amount +transationfee;
		System.out.println("ur amount"+amount);
		System.out.println("transationfee"+transationfee);
		System.out.println("totalamount"+totalamount);
		System.out.println("payment Successful");
	}
	
}
