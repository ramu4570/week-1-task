package project1;
import java.util.*;
public class indexvalues {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter arrray elements");
		int [] arr = new int [5];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("enter the element to find index value");
		int search = sc.nextInt();
		int found =0;
		
		for(int j=0;j<arr.length; j++) {
			if(arr[j]==search) {
				System.out.println("index value of element is:"+j);
			}
			}
		if(found ==0) {
			System.out.println("enter valid value");
		}
	}

}
