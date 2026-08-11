import java.util.*;

public class fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		System.out.print("fibonacci series is: ");
		for (int i = 0; i < num - 1; i++) {
			n3 = n1 + n2;
			System.out.print(n3+" ");
			n1 = n2;
			n2 = n3;
		}
	}
}
