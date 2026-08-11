import java.util.Scanner;

public class factorialrecursion {
	static int fact(int n) {
		if (n==0 || n==1) {
			return 1;
		}else {
			return n* fact(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur number:");
		int num = sc.nextInt();
		System.out.println("factorial is:"+fact(num));
	}

}
