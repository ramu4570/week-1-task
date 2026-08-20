
public class secondlargest {

	public static void main(String[] args) {
		int [] arr = {2,4,6,7,4,8,11};
		int max = arr[0];
		int smax = arr[0];
		for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			smax = max;
			max = arr[i];
		}else if(arr[i]>smax){
			smax = arr[i];
		}
		}
		System.out.println("second largest number is:"+smax);
	}

}
