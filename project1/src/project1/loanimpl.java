package project1;

import java.util.*;

public class loanimpl implements loan {
Scanner sc= new Scanner(System.in);
	
	public boolean isphonevaild() {
		System.out.println("enter ur mobile number");
		String phone = sc.nextLine();
		return phone.matches("[0-9]{10}");
	}
	
	public boolean isaadharvalid() {
		System.out.println("enter ur aadhar number");
		String aadhar = sc.nextLine();
		return aadhar.matches("[0-9]{12}");
	}
	
	public boolean ispanvalid() {
		System.out.println("enter ur pan number");
		String pan = sc.nextLine();
		return pan.matches("[A-Za-z]{5}[0-9]{4}[a-z]{1}");
	}
	
	public String getcustomername() {
		System.out.println("enter ur name");
		String name = sc.nextLine();
		return name;
	}
	
	public int getcustomerage() {
		System.out.println("enter ur age");
		int age =sc.nextInt();
		return age;
	}
	
	public double getcustomersalary() {
		System.out.println("enter ur salary");
		double salary = sc.nextDouble();
		return salary;
	}
	
	public int getcibilscore() {
		System.out.println("enter ur cibil score");
		int cibil = sc.nextInt();
		if(cibil>=300 && cibil<=549) {
			System.out.println("poor- high risk to take loan");
		}else if(cibil>=550 && cibil<=699) {
			System.out.println("fair - moderate risk to take loan");
		}else if(cibil>=700 && cibil<=749) {
			System.out.println("good- low risk to take loan");
		}else if(cibil>=750 && cibil<=900) {
			System.out.println("excellent-very low risk to take loan");
		}else {
			System.out.println("invalid cibil infornation");
		}
		return cibil;
	}
	
	//double getloanroi(int cibil) {
		//double roi= 8.5;
	//	if(cibil>=300 && cibil<=549) {
		//	System.out.println("poor- high risk to take loan");
	//	}else if(cibil>=550 && cibil<=699) {
	//		System.out.println("fair - moderate risk to take loan");
	//	}else if(cibil>=700 && cibil<=749) {
	//		System.out.println("good- low risk to take loan");
	//	}else if(cibil>=750 && cibil<=900) {
	//		System.out.println("excellent-very low risk to take loan");
	//	}else {
	//		System.out.println("invalid cibil infornation");
	//	}
	//	return roi;
	//}

}


