import java.util.*;
public class arrays {

	public static void main(String[] args) {
		int [] arr =  new int[323467876];
		System.out.println(arr);// this prints the address of arr
		
		 for(int n: arr) {  //this is for each loop
		 System.out.print(n +" ");
		 }
		 
		 for(int i=0;i<arr.length; i++) {// this general for with conditions
			 System.out.print(arr[i]);
		 }
	}

}
