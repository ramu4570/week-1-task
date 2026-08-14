import java.util.*;
public class decimalnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur binary number:");
		int n = sc.nextInt();
		
		int r =0;
		String binaryvalue = " ";
		while(n>0) {
			r = n%2;
			n = n/2;
			binaryvalue = r+ binaryvalue;
		}
		System.out.println("decimal value is:"+binaryvalue);
	}

}
