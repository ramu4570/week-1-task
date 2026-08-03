import java.util.Scanner;
public class movietheater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your name");
		String name = sc.nextLine();
		
		System.out.println("enter your age");
		int age = sc.nextInt();
		if(age<0||age>100) {
			System.out.println("entered wrong age");
		}else {
			System.out.println("1.silver rs-200");
			System.out.println("2.gold rs-300");
			System.out.println("3.platinum rs-500");

			System.out.println("select your ticket type");
			int  ticket  = sc.nextInt();
			
			switch(ticket) {
			case 1:
			double silverprice = 200;
			if(age >= 60) {
				silverprice = silverprice -(silverprice *10/100);
			}
			System.out.println("silverticketprice:" +silverprice);
			break;
			
		case 2:
			double goldprice = 300;
			if(age >= 60) {
				goldprice = goldprice -(goldprice *10/100);
			}
			System.out.println("goldticketprice:" +goldprice);
			break;
			
		case 3:
			double platinumprice = 500;
			if(age >= 60) {
				platinumprice = platinumprice -(platinumprice *10/100);
			}
			System.out.println("platinumticketprice:" +platinumprice);
			break;
			
			default:
				System.out.println("select correct one");
			}
		} 
		
	}
}
