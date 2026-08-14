import java.util.Scanner;
public class targetnumber {

	public static void main(String[] args) {  	
	int [] arr = {1,2,3,4,5,6,9};
	Scanner sc = new Scanner(System.in);
	System.out.println("enter ur target number:");
	int target = sc.nextInt();
	int sum =0;
	int i=0;
	int j=arr.length-1;
	while(i<j) {
		sum = arr[i]+arr[j];
		if (sum == target){
			System.out.println("target number is:"+sum);
			System.out.println("pair is:"+arr[i]+"+"+arr[j]);
			break;
		}else if(sum<target) {
			i++;
		}else{
			j--;
		}
	}
	if(sum != target) {
		System.out.println("target not found");
	}

	}

}
