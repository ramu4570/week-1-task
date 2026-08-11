import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		
		int r=0;
		int rev=0;
		while(n>0) {
		r = n%10;
		n = n/10;
		rev = rev*10+r;
		}
		System.out.println("reverse of number is:"+rev);
	}

}
