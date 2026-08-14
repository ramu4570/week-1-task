import java.util.Scanner;

public class reverse {
//reverse of a number and palindrone
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		
		int original =n;// this condition is for palindrone
		int r=0;
		int rev=0;
		while(n>0) {
		r = n%10;
		n = n/10;
		rev = rev*10+r;
		}
		if (rev == original) {//condition is for palindrone
			System.out.println("it is a palindrone");
		}else {
			System.out.println("it is not a palindrone");
		}
		System.out.println("reverse of number is:"+rev);
	}

}
