package project1;

import java.util.Scanner;

public class area {
	 
	double areaofrectangle(double length, double breadth){
	return length *breadth;
	System.out.println("area of rectangle"+ length,breadth);
	}
	double areaofsquare(double side) {
		return side*side;
	}
    void main(String[] args) {
        
    	Scanner sc= new Scanner(System.in);
		
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("area of rectangle"+ (l*b));
		
	}

}
