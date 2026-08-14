import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  ur number:");
		int n = sc.nextInt();
		
		int temp=n;
		int count =0;
		int sum = 0;
		int r = 0;
		
		while(n>0) {
			n=n/10;
		    count= count+1;
		}
		
		n = temp;
		while(n>0) {
			r = n%10;
			n= n/10;
			sum = sum + (int) Math.pow(r,count);
		}
		if(sum == temp) {
			System.out.println("it is Armstrong");
		}else {
			System.out.println("it is not Armstrong");

		}
	}

}
