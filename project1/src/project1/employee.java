package project1;

public class employee {
	
		static String companyname;
		static String location;
	
	    String employeename;
		int employeesalary;
		
		static {
			companyname="vcube";
			location= "hyderabad";
		}
		public static void main(String[] args) { 
			employee e = new employee();
			e.employeename = "hello";
			e.employeesalary = 50000;
			System.out.println("Employee name : "+e.employeename);
			System.out.println("employee salary:"+e.employeesalary);
			System.out.println("companyname:"+employee.companyname);
			System.out.println("location:"+location);
			
			employee e1 = new employee();
			e1.employeename = "kong";
			e1.employeesalary = 750000;
			System.out.println("Employee name : "+e1.employeename);
			System.out.println("employee salary:"+e1.employeesalary);
			System.out.println("companyname:"+companyname);
			System.out.println("location:"+location);
		}
	}


