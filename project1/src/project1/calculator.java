package project1;
import java.util.Scanner;
public class calculator {
	
	 void addition(int a,int b) {
		int add = a+b;
		System.out.println("addition:"+add);
	}
	 void subtraction(int a,int b) {
	   float sub = a-b;
	   System.out.println("subtraction:"+sub);
	 }
	 void multiply(int a,int b) {
		 double mul = a*b;
		 System.out.println("multiply:"+mul);
	 }
	 void divide(int a,int b) {
		 long div = a/b;
		 System.out.println("divide:"+div);
	 }
	 void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter your number a:");
		 int a = sc.nextInt();
		 
		 System.out.println("enter your number b:");
		 int b = sc.nextInt();
		 
		 
		 addition(a,b);
		 subtraction(a,b);
		 multiply(a,b);
		 divide(a,b);
		 }

}
