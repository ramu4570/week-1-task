import java.util.Scanner;
public class neon {
	static void neonumber(int n) {
		int sq =n*n;
		int sum=0;
	for(int i=sq;i>0;i=i/10) {
		 sum = sum+(i%10);//adds reminderfor(i%10)
	}
	if(sum == n) {
		System.out.println("it is neon");
	}else {
		System.out.println("not a neon");
	}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int neon =  sc.nextInt();
		neonumber(neon);
		
	}

}
