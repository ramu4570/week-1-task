package project1;

public class student{
	int id;
	String studentname;
	int age;
	static int countryid = 55;
	static String countryname = "india";

	public static void main(String[] args) {
System.out.println("welcome to india");
System.out.println("student 1 inform");
student rao = new student();
rao.id=12;
rao.studentname="praneeth";
rao.age=45;
System.out.println("country id :"+ countryid);
System.out.println("country name :"+countryname);
System.out.println("student id :"+rao.id);
System.out.println("student name :"+rao.studentname);
System.out.println("student age :"+rao.age);
student ram = new student();
ram.id=62;
ram.studentname ="rameshwar rao";
ram.age=25;
System.out.println("country id :"+ countryid);
System.out.println("country name :"+countryname);
System.out.println("student id :"+ram.id);
System.out.println("student name :"+ram.studentname);
System.out.println("student age :"+ram.age);
student king = new student();
king.id=62;
king.studentname ="kanthrao";
king.age=25;
System.out.println("country id :"+ countryid);
System.out.println("country name :"+countryname);
System.out.println("student id :"+king.id);
System.out.println("student name :"+king.studentname);
System.out.println("student age :"+king.age);
 	}

}
