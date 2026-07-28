package project1;

public class mobilerecharge {
	void rechargeplan() {
		System.out.println("current recharege plan");
		System.out.println("plan name : unlimited 299");
		System.out.println("validity : 28 days");
		System.out.println("data : 1.5 gb/day");
		System.out.println("calls : unlimited");
	}
	void recharge(double amount) {
		System.out.println("recharge successful!!");
		System.out.println("recharge amount:"+amount);
	}
	void main(String[] args) {
		rechargeplan();
		recharge(299);
	}
	
}