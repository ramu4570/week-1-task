import java.util.Scanner;
public class evennumber {
	static void even(int n) {
        System.out.println("Even numbers are: ");
		for(int i=0; i<=n; i++) {
			if(i%2 ==0) {
			System.out.print(+i+" ");
		}
	}
		System.out.println();
	}
		static void odd(int n) {
	        System.out.println("odd numbers are: ");
			for(int i=0; i<=n; i++) {
				if(i%2 !=0) {
				System.out.print(+i+" ");
			}
		}
		//	System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num = sc.nextInt();
		even(num);
		odd(num);
	}

}
