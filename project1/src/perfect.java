import java.util.*;
public class perfect {
//sum of even numbers
	public static void main(String[] args) {
		int sum =0;
		for( int i=1;i<=100;i++) {
			if(i%2 == 0) {
				sum = sum+i;
			}
		}
		System.out.println("sum of even numbers are:"+sum);
		//this is digit count
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = sc.nextInt();
		int count =0;
		while(n>0) {
			n=n/10;
			count = count +1;
		}
		System.out.println("number of digits count:"+count);
	}
	

}
