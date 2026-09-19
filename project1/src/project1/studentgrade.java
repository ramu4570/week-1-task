package project1;

import java.util.*;

public class studentgrade {
	Scanner sc = new Scanner(System.in);

	void calculategrade(int marks) {

		System.out.println("see ur grade");
	}
}

class engineeringstudent extends studentgrade {
	void calculategrade(int marks) {

		if (marks > 900 && marks < 1000) {
			System.out.println("grade =A");
		} else if (marks > 700 && marks < 900) {
			System.out.println("grade =B");
		} else if (marks > 600 && marks < 700) {
			System.out.println("grade = c");
		} else {
			System.out.println("invalid marks");
		}
	}
}

class medicalstudent extends studentgrade {
	void calculategrade(int marks) {

		if (marks >= 9 && marks < 10) {
			System.out.println("grade =A");
		} else if (marks >= 7) {
			System.out.println("grade =B");
		} else if (marks >= 6) {
			System.out.println("grade = c");
		} else {
			System.out.println("invalid marks");
		}
	}

}

class managemantstudnt extends studentgrade {
	void calculategrade(int marks) {

		if (marks > 90 && marks < 100) {
			System.out.println("grade =A");
		} else if (marks > 70) {
			System.out.println("grade =B");
		} else if (marks > 60) {
			System.out.println("grade = c");
		} else {
			System.out.println("invalid marks");
		}
	}
}
