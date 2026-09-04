package project1;
import java.util.*;
	public class homeloan extends loanimpl {
		void getpersonalloandocinfo() {
			System.out.println("all home loan doc got verified successfully");
		}
		
		public static void main(String[] args) {
			System.out.println("welocme to home loan");
			homeloan hl = new homeloan();
			
			String name = hl.getcustomername();
			double salary  = hl.getcustomersalary();
			int age = hl.getcustomerage();
			int cibil = hl.getcibilscore();
			
			hl.sc.nextLine();
			
			if(salary>900000 && age>=27 && cibil>300 && cibil<=900) {
				System.out.println("information is valid");
				
				if(hl.isphonevaild() && hl.isaadharvalid() && hl.ispanvalid()) {
					System.out.println("details are good & loan approved");
					hl.getpersonalloandocinfo();
					//System.out.println("your loanroi is:"+pl.getloanroi(cibil));
				}else {
					System.out.println("something went wrong");
				}
				}else {
					System.out.println("your not eliginle for loan ");
			}
		}
	

	}


