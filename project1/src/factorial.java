import java.util.Scanner;
public class factorial {
	static void fac(int n) {
		int fact=1;
		for(int i=n;i>=1;i--) {
			fact= fact*i;
		}
		System.out.println("factorial of number is:"+fact);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur number:");
		int num = sc.nextInt();
		fac(num);
	}

}
