package project1;

// 2.TU Dresden university

public class westcollege extends germanyimpl {

	public boolean getcourse() {

		System.out.println("TU Dresden courses:");

		System.out.println("cse=4500-fee");

		System.out.println("ece=4000-fee");

		System.out.println("mechanical=3500-fee");

		System.out.println("enter ur course:");

		String course = sc.nextLine();

		return course.matches("cse=4500-fee|ece=4000-fee|mechanical=3500-fee");
	}

	void getdeadline() {

		System.out.println("deadline for application is:15/10/2026");

	}

	void getwestcollege() {

		System.out.println("all documents got verified successfully");

		System.out.println("admission letter will be processed");

	}
}