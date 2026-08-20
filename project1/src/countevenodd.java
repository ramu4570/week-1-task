import java.util.*;
public class countevenodd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a array");
		
		int[] arr = new int[5];
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int counte =0;
		int counto =0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 ==0) {
				counte = counte+1;
			}else if(arr[i]%2 != 0){
				counto = counto +1;
			}
		}
		System.out.println("count of even numbers are:"+counte);
		System.out.println("count of odd numbers are:"+counto);
	}

}
