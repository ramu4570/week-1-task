
public class arrayssumavg {

	public static void main(String[] args) {
		int [] arr = {5,3,6,3,7,2,3,2};
		int sum =0;
		int avg =0;
		for(int i=0;i<arr.length;i++) {
		sum = sum+arr[i];	
		avg = sum/arr.length;
		}
		System.out.println("sum of array is:"+sum);
		System.out.println("avg of array is:"+avg);

	}

}
