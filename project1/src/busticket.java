import java.util.Scanner;
public class busticket {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter ur name");
		String name = sc.nextLine();
		
		System.out.println("enter ur age");
		int age = sc.nextInt();
		
		System.out.println("ordinary -100");
		System.out.println("express -200");
		System.out.println("delux -300");
		
		System.out.println("enter ur tickettype");
		int ticket = sc.nextInt();
		
		switch(ticket) {
		case 1:
		int ordinary = 100;
		if (age<20) {
			ordinary= ordinary-20;
		}
			System.out.println("ordinary ticketprice:"+ordinary);
		break;
		
		case 2:
			int express = 200;
			if (age<20) {
				express= express-20;
			}
				System.out.println("express ticketprice:"+express);
			break;
			
		case 3:
			int delux = 300;
			if (age<20) {
				delux= delux-20;
			}
				System.out.println("delux ticketprice:"+delux);
			break;
			
			default:
				System.out.println("select correct ticket");
		}

}
}