package project1;

import java.util.Scanner;

public class Information {
	
	void fullname(String fname,String lname) {
		System.out.println("employee full name:" +fname+lname);
	}
	void employeeage(int age) {
		System.out.println("employee age:"+age);
	}
	void heightweight( double height,double weight) {
		System.out.println("employee height:"+height);
		System.out.println("employee weight:"+weight);
	}

     void main(String[] args) {
    	 Scanner sc= new Scanner(System.in);
    	 
    	 System.out.println("enter your firstname:");
    	 String firstname =sc.nextLine();
    	 
    	 System.out.println("enter your lastname:");
    	 String lastname =sc.nextLine();
    	 
    	 System.out.println("enter your age:");
    	 int age = sc.nextInt();
    	 
    	 System.out.println("enter your height:");
    	 double height = sc.nextDouble();
    	 
    	 System.out.println("enter your weight:");
    	 double weight = sc.nextDouble();
    	 
    	 //calling methods
    	 
    	 fullname(firstname, lastname);
    	 employeeage(age);
    	 heightweight(height,weight);
	}

}
