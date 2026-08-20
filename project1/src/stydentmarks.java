import java.util.*;

public class stydentmarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of student marks:");
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		int countm =0;
		int countl =0;
		int highest =arr[0];
		System.out.print("enter marks of students:"+" ");
		for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
		if(arr[i]>=40) {
			countm++;
		}else if(arr[i]<=40) {
			countl++;
		}
		if(arr[i]>highest) {
			highest = arr[i];
		}
	}
		System.out.println("marks more than 40:"+countm);
		System.out.println("marks less than 40:"+countl);
		System.out.println("highest marks:"+highest);
	}
}
