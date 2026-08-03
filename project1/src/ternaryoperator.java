//using ternary operator
import java .util.Scanner;
public class ternaryoperator {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the marks:");
		int marks = sc.nextInt();
		
		if (100>marks) {
		String grade = (marks >= 90) ? "A"
				     : (marks >= 80) ? "B"
				     : (marks >= 60) ? "c"
				     : (marks >= 40) ? "d"
				     : "fail"; 
		System.out.println("student result:"+grade);
		}else {
		System.out.println("enter correct marks");
		}
}
	}
