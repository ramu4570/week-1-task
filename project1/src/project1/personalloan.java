package project1;
import java.util.*;
public class personalloan extends loanimpl{
	void getpersonalloandocinfo() {
		System.out.println("all personal loan doc got verified successfully");
	}
	
	public static void main(String[] args) {
		System.out.println("welocme to personal loan");
		personalloan pl = new personalloan();
		
		String name = pl.getcustomername();
		double salary  = pl.getcustomersalary();
		int age = pl.getcustomerage();
		int cibil = pl.getcibilscore();
		
		pl.sc.nextLine();
		
		if(salary>900000 && age>=27 && cibil>300 && cibil<=900) {
			System.out.println("information is valid");
			
			if(pl.isphonevaild() && pl.isaadharvalid() && pl.ispanvalid()) {
				System.out.println("details are good & loan approved");
				pl.getpersonalloandocinfo();
				//System.out.println("your loanroi is:"+pl.getloanroi(cibil));
			}else {
				System.out.println("something went wrong");
			}
			}else {
				System.out.println("your not eliginle for loan ");
		}
	}

}
