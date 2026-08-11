import java.util.*;
public class primenumber {

	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		System.out.println("enter upto ur number:");
		int num = Sc.nextInt();
		System.out.println("prime number is:");
		for(int i=2; i<num; i++) {
			boolean isprime = true;
		
		for(int j=2; j<i; j++) {
			if(i%j ==0) {
				isprime = false;
				break;
			}
		}
		if(isprime == true) {
			System.out.print(i+" ");
		}
	}
	}
}
