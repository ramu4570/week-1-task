import java.util.Scanner;
public class perfectnumber {
	static void perfect(int n) {
		int sum=0;
		for(int i=1; i<n;i++) {
			if(n%i==0) {
				sum= sum+i;
			}
		}
			if(sum==n) {
				System.out.println("perfect number"+sum);
			}else {
				System.out.println("not a perfectnumber");
			}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		perfect(num);
	}

}
