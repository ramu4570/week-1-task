import java.util.Scanner;

public class firstnprime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur digit:");
		int num = sc.nextInt();
		
		int count =0;
		int n=2;
		System.out.println("prime numbers are:");

		while(count<num) {
			boolean prime = true;
		
		for(int i=2; i<n/2; i++) {
			if(n%i==0) {
				prime = false;
				break;
			}
			}
		if(prime) {
			System.out.print(n+" ");
			count++;
		}
		n++;
		}
	}
}


