
public class minmax {

	public static void main(String[] args) {
		int [] arr = {2,4,6,7,4,8,11};
		int max = arr[0];
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			min = arr[i];
		}else if(arr[i]>max){
			max = arr[i];
		}
		}
		System.out.println("min number is:"+min);
		System.out.println("max number is:"+max);
	}

}
