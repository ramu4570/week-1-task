package project1;
import java.util.*;
public class scannermatrix {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int [][] matrix = new int [3][3];
		
		System.out.println("enter the elements");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("output of the matrix is:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("reverse of the matrix is:");
		for(int i=2;i>=0;i--) {
			for(int j=2;j>=0;j--) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
	}
		System.out.println("transpose of the matrix is:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
	}
		//squareing of the matrix only diagonally
		for(int i=0;i<3;i++) {
			matrix[i][i] = matrix[i][i]*matrix[i][i];
			}
		System.out.println("square of the matrix is:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
	}
	}
}

