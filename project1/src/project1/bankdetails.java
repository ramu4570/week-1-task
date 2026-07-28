package project1;
import java .util.Scanner;
public class bankdetails {
	static String bankname = "sbi";
	static String branch = "kphb";
	Long accountnumber = 12347850L;

	
	void bank(String accountholdername,int age) {
		accountnumber++;
		System.out.println("bankname:"+bankname);
		System.out.println("branch:"+branch);
		System.out.println("accountnumber:"+accountnumber);
		System.out.println("accountholdername:"+accountholdername);
		System.out.println("age:"+age);
		}

	 void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("enter your name");
		 String name = sc.nextLine();
		 
		 System.out.println("enter your age");
		 int age = sc.nextInt();
		 if(age<18) {
			 System.out.println("not eligible");
		 }
		 else {
		     bank(name,age);
	 }
	 }

}
