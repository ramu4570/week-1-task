package project1;
import java.util.*;
public class duplicateelements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array elements:");
		int [] arr =new int[8];
		
		for(int i=0; i< arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i< arr.length; i++) {
			int count =0;

			for(int j=0; j< arr.length; j++) {
				if(arr[i] == arr[j]) {
					count= count+1;
				}
			}
			if(count>1) {
				System.out.println("duplicate numbers are"+arr[i]+" ");
			}else {
				System.out.println("non duplicate numbers are"+arr[i]+" ");
			}
		}
		
	}
}

