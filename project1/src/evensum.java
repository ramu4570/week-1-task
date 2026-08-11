import java.util.*;
public class evensum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number:");
		int num = sc.nextInt();
		int sum =0;
		
		for(int i=0;i<=num;i++) {
			sum= sum+i;
			if(i%2==0) 
		System.out.print(i+",");
		}
		System.out.println();
		System.out.print("sum is:"+sum);

	}

}
