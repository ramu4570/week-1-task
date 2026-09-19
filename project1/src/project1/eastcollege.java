package project1;

// 1.TU Berlin university

public class eastcollege extends germanyimpl {

	void geteastcollege() {

		System.out.println("all documents got verified successfully");
		System.out.println("admission letter will be processed");

	}

	public boolean getcourse() {

		System.out.println("TU Berlin courses:");

		System.out.println("cse=5000-fee");
		System.out.println("ds=3000-fee");
		System.out.println("aiml=7000-fee");

		System.out.println("enter ur course:");

		String course = sc.nextLine();

		return course.matches("cse=5000-fee|ds=3000-fee|aiml=7000-fee");
	}

	void getdeadline() {

		System.out.println("deadline for application is:09/10/2026");

	}

	public static void main(String[] args) {

		eastcollege ec = new eastcollege();

		ec.getwelcome();

		boolean name = ec.getstudentname();

		boolean gender = ec.getstudentgender();

		boolean age = ec.getstudentage();

		String nation = ec.getstudentnation();

		if (name && gender && age && ec.getphonenumber() && ec.getaadharnumber() && ec.getpassportnumber()
				&& ec.getstudentlanguage()) {

			System.out.println("ok details are good");

			double grade = ec.getbtechgrade();

			double marks = ec.get12thmarks();

			double cgpa = ec.get10thcgpa();

			if (grade > 7 && grade < 10 && marks > 750 && marks < 1000 && cgpa > 7 && cgpa < 10) {

				System.out.println("ok good score ur eligible");

				boolean passout = ec.getpassoutyear();

				float financial = ec.getfinancialstatus();

				if (passout && financial > 2) {

					System.out.println("processed to next");

					String college = ec.getcollege();

					if (college.equals("1.TU Berlin university")) {

						System.out.println("welcome to " + college);

						ec.getdeadline();

						if (ec.getcourse()) {

							System.out.println("good course");

							ec.geteastcollege();

						} else {

							System.out.println("no course available");
						}

					} else if (college.equals("2.TU Dresden university")) {

						westcollege wc = new westcollege();

						System.out.println("welcome to " + college);

						wc.getdeadline();

						if (wc.getcourse()) {

							System.out.println("good course");

							wc.getwestcollege();

						} else {

							System.out.println("no course available");
						}

					} else {

						System.out.println("invalid college");
					}

				} else {

					System.out.println("you cannot process");
				}

			} else {

				System.out.println("bad score!! ur not eligible");
			}

		} else {

			System.out.println("something went wrong!! check it");
		}
	}
}