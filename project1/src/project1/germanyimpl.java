package project1;

import java.util.*;

public class germanyimpl implements germany {
	Scanner sc = new Scanner(System.in);

	public void getwelcome() {
		System.out.println("welcome to ur germany college application");
	}

	public boolean getstudentname() {
		System.out.println("enter ur fullname");
		String name = sc.nextLine();
		return name.matches("[A-Za-z ]+");
	}

	public boolean getstudentgender() {
		System.out.println("enter ur gender: [male|female]");
		String gender = sc.nextLine();
		return gender.matches("male|female");
	}

	public boolean getstudentage() {
		System.out.println("enter ur age: [age>21 || age<30]");
		int age = sc.nextInt();
		sc.nextLine();
		return age > 21 && age < 30;
	}

	public String getstudentnation() {
		System.out.println("enter ur nation");
		String nation = sc.nextLine();
		return nation;
	}

	public boolean getphonenumber() {
		System.out.println("enter ur phone number");
		String phone = sc.nextLine();
		return phone.matches("[0-9]{10}");
	}

	public boolean getaadharnumber() {
		System.out.println("enter ur aadhar number");
		String aadhar = sc.nextLine();
		return aadhar.matches("[0-9]{12}");
	}

	public boolean getpassportnumber() {
		System.out.println("enter ur passport number");
		String passport = sc.nextLine();
		return passport.matches("[A-Z]{1}[0-9]{10}");
	}

	public boolean getstudentlanguage() {
		System.out.println("enter ur language: [english|german]");
		String language = sc.nextLine();
		return language.matches("english|german");
	}

	public double getbtechgrade() {
		System.out.println("enter ur b.tech grade");
		double grade = sc.nextDouble();
		return grade;
	}

	public double get12thmarks() {
		System.out.println("enter ur 12th marks");
		double marks = sc.nextDouble();
		return marks;
	}

	public double get10thcgpa() {
		System.out.println("enter ur 10th cgpa");
		double cgpa = sc.nextDouble();
		return cgpa;
	}

	public boolean getpassoutyear() {
		System.out.println("enter year of passout:[2025/2026/2027/2028]");
		sc.nextLine();
		String year = sc.nextLine();
		return year.matches("2025|2026|2027|2028");
	}

	public float getfinancialstatus() {
		System.out.println("enter ur finanacialstatus in crores:");
		float fstatus = sc.nextFloat();
	    sc.nextLine();
		if (fstatus < 2) {
			System.out.println("invalid financial status");
		} else if (fstatus <= 4) {
			System.out.println("very risk to go for higher studies");
		} else if (fstatus <=9) {
			System.out.println("moderate risk to go for higher studies");
		} else {
			System.out.println("no risk to go for higher studies");
		}
		return fstatus;
	}
	public String getcollege() {
		System.out.println("enter which university u want: [1.TU Berlin university /2.TU Dresden university]");
		String choice = sc.nextLine();
		
		switch(choice) {
		
		case "1.TU Berlin university":
			return "1.TU Berlin university";
		case "2.TU Dresden university":
			return "2.TU Dresden university";
			
			default :
				return "invalid college";
		}
	}

}
