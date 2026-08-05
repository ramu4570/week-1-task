import java.util.Scanner;

public class reestaurant {
	double total = 0;

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("welcome to restaurent");
        System.out.println("we had veg menu");
		System.out.println("we had non veg menu");
		System.out.println("we had deserts menu");
		System.out.println("please select ur order");
		
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 :
			System.out.println("1.paneer -100");
			System.out.println("2.roti -20");
			
			int vegchoice = sc.nextInt();
			
			switch(vegchoice) {
			case 1:
				total = total+100;
				break;
				
			case 2 :
				total = total+20;
				break; 
				
				default:
					System.out.println("invalid choice");
			}
			break;
		case 2:
			System.out.println("1.chickenbiryani -200");
			System.out.println("2.muttonbiryani -300");
			
			int nonvegchoice = sc.nextInt();
			
			switch(nonvegchoice) {
			case 1: 
				total = total+200;
				break;
				
			case 2:
				total = total+300;
				break;
				
				default:
					System.out.println("invalid choice");
			}
			break;
		case 3:
			System.out.println("1.icecream-50");
			
			int deserts = sc.nextInt();
			
			switch(deserts) {
			case 1:
				total = total+50;
				break;
				
				default:
					System.out.println("invalid choice");
			}
			break;
			default:
				System.out.println("invalid menu");
		}
		System.out.println("total bill = "+total);
	}

}
