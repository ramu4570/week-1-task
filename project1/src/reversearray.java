//reverse of array using two pointers.
import java.util.*;
public class reversearray {
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("enter a array size");
		int num = sc.nextInt();		
		int [] arr = new int[num];
		System.out.println("enter numbers:");

		
		for(int i=0;i< arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int temp =0;
		int left =0;
		int right =arr.length-1;
		while(left<right) {
		temp =arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		left++;
		right--;
		}
		System.out.println("reverse of array"+Arrays.toString(arr));
	}
		

}
