import java.util.Scanner;
public class multiplication {
	static void table(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n +"*"+i +"="+(n*i));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		table(num);
	}

}
