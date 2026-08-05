import java.util.Scanner;
public class loops {

	static void fac(int n) {
		for (int i=1;i<=n;i++) {
			if ( n % i == 0) {
				System.out.println(i);
			}
		}
	}
	 void main(String[] args) {
		 
				 Scanner sc = new Scanner(System.in);
				 System.out.println("enter a number ");
				 int num = sc.nextInt();
				 System.out.println("factors are");
				 fac(num);
			 }
}		 
		 
		 
	 


