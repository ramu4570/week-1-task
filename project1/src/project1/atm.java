package project1;
import java.util.*;
public class atm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("main method started");
		try {
			System.out.println("enter ur amount");
			String amount = sc.nextLine(); 
			
			Double num1 = Double.parseDouble(amount);
		}
			catch(NumberFormatException e) {
				System.out.println("invalid amount"+e);
			}
		
		try {
			String accountname = null;
			System.out.println("account name:"+accountname.length());
		}
		catch(NullPointerException e) {
			System.out.println("account details are not valid:"+e);
		}
		System.out.println("main method ended");
	try{
		String[] transactions = {"withdraw","deposit","balance"};
		
		System.out.println("enter the index");
		int index = sc.nextInt();
		System.out.println("transaction:"+transactions[index]);
		}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("invalid index"+e);
		
	}
		}
	}


