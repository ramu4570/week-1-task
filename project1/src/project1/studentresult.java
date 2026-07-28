package project1;
import java.util.Scanner;

public class studentresult {
	void displaystudent(String name) {
		System.out.println("student name:"+name);
	}
	void calculatetotal(int m1,int m2, int m3) {
		int total= m1+m2+m3;
		System.out.println("total marks:"+total );
	}
	void calculateaverage(int m1, int m2, int m3) {
		double average =(m1+m2+m3)/3;
		System.out.println("total average:"+average);
	}
	
   void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
	   
	   System.out.println("enter your name:");
	   String name = sc.nextLine();
	   
	   System.out.println("enter m1 marks:");
	   int m1 = sc.nextInt();
	   System.out.println("enter m2 marks:");
	   int m2 = sc.nextInt();
	   System.out.println("enter m3 marks:");
	   int m3 = sc.nextInt();
	   
	   displaystudent(name);
	   calculatetotal(m1,m2,m3);
	   calculateaverage(m1,m2,m3);

   }
}