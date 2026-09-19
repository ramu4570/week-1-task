package project1;

import java.util.*;

public class grading extends studentgrade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1.engineering");
		System.out.println("2.medical");
		System.out.println("3.management");

		System.out.println("enter ur choice");
		String choice = sc.nextLine();

		switch (choice) {

		case "1.engineering":
			System.out.println("enter ur engineeringmarks[upto 1000]");
			int marks = sc.nextInt();
			studentgrade sg = new engineeringstudent();
			sg.calculategrade(marks);
			break;

		case "2.medical":
			System.out.println("enter ur medicalmarks[upto 10]");
			marks = sc.nextInt();
			sg = new medicalstudent();
			sg.calculategrade(marks);
			break;

		case "3.management":
			System.out.println("enter ur managementmarks[upto 100]");
			marks = sc.nextInt();
			sg = new managemantstudnt();
			sg.calculategrade(marks);
			break;

		default:
			System.out.println("invalid choice");

		}
	}
}
