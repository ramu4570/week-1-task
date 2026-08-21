package project1;
import java.util.*;
public class missingnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array elements");
		int[] arr = new int [7];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int n=8;
		int expectedsum = n*(n+1)/2;
		int actualsum = 0;
		int missing=0;
		
		for(int j=0;j<arr.length;j++) {
			actualsum = actualsum+arr[j];
		}
		missing = expectedsum- actualsum;
		
		System.out.println("missing numbers:"+missing);
	}

}
