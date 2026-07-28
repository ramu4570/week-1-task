import java.util.Scanner;
public class salaryslip {
	void salary(String employeename,double basicsalary) {
		double hra =  basicsalary * 20 /100;
		double da = basicsalary * 10/100;
		double grossalary = basicsalary + hra + da ;
		System.out.println("hra: "+hra);
		System.out.println("da: "+da);
		System.out.println("grossalary:" +grossalary);
	}

	  void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name:");
		String name = sc.nextLine();
		
		System.out.println("enter basic salary:");
		double salary = sc. nextDouble();
		
		//salaryslip s = new salaryslip();
	     salary(name, salary);
	}

}
