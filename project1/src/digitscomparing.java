import java.util.Scanner;
public class digitscomparing {

	 void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("enter a number");
		int a =  sc.nextInt();
		
		if ( a>=0 && a<=9) {
			System.out.println("entered a one digit number");
		}else if( a>=10 && a<=99 ) {
			System.out.println("entered a two digit number");
		}else if( a>=100 && a<=999 ) {
			System.out.println("entered a three digit number");
		}else if( a>=1000 && a<=9999) {
			System.out.println("entered a four digit number");
		}else {
			System.out.println("enter a valid number");
		}
	}

}
