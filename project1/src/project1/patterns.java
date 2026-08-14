package project1;

public class patterns {

	public static void main(String[] args) {
		int[][] arr = new int [3][4];
		arr [0][0] =10;
		arr [1][1] =100;
		arr [2][2] =200;
		
		for(int i=0; i<arr.length; i++) {   //this is for row
		for(int j=0; j<arr[i].length;j++) {  // this is for column
			System.out.print(arr[i][j]+" ");
		}
        System.out.println();//this is for printing line by line
		}
	}

}
