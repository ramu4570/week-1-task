package project1;
import java.util.*;
public class summatrix {

	public static void main(String[] args) {
		int sum =0;
		int [][] a= new int[3][3];
		int k=1;
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=k;
				k++;
			}
		}
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
				sum = sum+a[i][j];
			}
			System.out.println();
		}
		System.out.println("sum of array is"+sum);
		}

}
