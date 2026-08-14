import java.util.Scanner;

public class productnumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		
		int r =0;
		int product = 1;
		while(n>0) {
			r=n%10;
			n=n/10;
			product = product *r;
		}
		System.out.println("product of number is:"+product);
	}

}
