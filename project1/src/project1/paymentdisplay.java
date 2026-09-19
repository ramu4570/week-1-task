package project1;
import java.util.*;
public class paymentdisplay {

	 void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.creditcard");
		System.out.println("2.upi payment");
		System.out.println("3.net banking");
		
		System.out.println("enter ur choice");
		int choice = sc.nextInt();
		
		if(choice>=1 && choice<=3) {
			
		System.out.println("enter ur amount");
		double amount = sc.nextDouble();
		
		payment payment;
		
		switch (choice) {
		case 1 :
			payment = new creditcard();
			payment.pay(amount);
			break;
			
		case 2 :
			payment = new upi();
			payment.pay(amount);
			break;
			
		case 3:
			payment = new netbanking();
			payment.pay(amount);
			break;
		}
		}else {
				System.out.println("invalid choice");
		}
	}
	 
}
