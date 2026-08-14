import java.util.Scanner;

public class largestnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur digit:");
		int n = sc.nextInt();
		
		int lar=0;
		int r=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			if(r>lar) {
				lar=r;
			}
		}
		System.out.println("largest digit is:"+lar);
	}
}
