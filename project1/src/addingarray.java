import java.util.Arrays;

public class addingarray {

	public static void main(String[] args) {
		int [] a1 = {2,3,4};
		int [] a2 = {5,7,9};
		
		int len =Math.max(a1.length,a2.length);
		int [] c = new int[len];
		
		for(int i=0;i<len;i++) {
			if(a1.length<=i) {
				c[i] = a2[i];
			}else if(a2.length<=i) {
				c[i] = a1[i];
			}else {
				c[i] =a1[i] +a2[i];
			}
		}
		System.out.println(Arrays.toString(c));

	}

}
