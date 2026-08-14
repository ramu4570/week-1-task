import java.util.Scanner;

public class happynumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur happy number:");
		int n = sc.nextInt();
		
		int sq= 0;
		int sum= 0;
		int r =0;
		for(int i=0; i<n;i++) {
			r=n%10;
			n =n/10;
			sum = sum +r*r;
		}
		n=sum;
		if(n == 1) {
			System.out.println("it is a happy number");
		}else {
			System.out.println("it is not a happy number");

		}
	}

}
