package project1;

import java.util.Scanner;

public class employeesalary {
	
	void dispalyemployee(String name) {
		System.out.println("employeename:"+name);
	}
	void calculatesalary(int bsalary,int bonous,int gifts) {
		int totalsalary= bsalary+bonous+gifts;
		System.out.println("emplyee salary:"+totalsalary);
	}

    void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	
    	System.out.println("enter your name:");
    	String name =sc.nextLine();
    	
    	System.out.println("enter bsalary:");
    	int bsalary = sc.nextInt();
    	
    	System.out.println("enter bonous:");
    	int bonous =sc.nextInt();
    	
    	System.out.println("enter gifts:");
    	int gifts =sc.nextInt();
    	
    	dispalyemployee(name);
    	calculatesalary(bsalary,bonous,gifts);
	}

}
