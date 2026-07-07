package project1;

public class employe {
	static String employedetails = "employe details";
	Integer empno;
	String ename;
	static Double salary =(double) 5000;
	String hiredate;
	Float  experience;
	static Double Annualsalary = salary*12;
	static Double Annualbonus = salary+10;
	static Double totalearnings = Annualsalary+Annualbonus;
	
	public static void main(String[] args) {
		employe ed = new employe();
		ed.empno = 101;
		ed.ename = "kong";
		ed.hiredate = "25-jul-2026";
		ed.experience = 2.5f;
		
		System.out.println(employedetails);
		System.out.println("empno:"+ed.empno);
		System.out.println("ename:"+ed.ename);
		System.out.println("salary:"+salary);
		System.out.println("hiredate:"+ed.hiredate);
		System.out.println("experience:"+ed.experience + "years");
		System.out.println("Annual salary:"+Annualsalary);
		System.out.println("Annual bonus:"+Annualbonus);
		System.out.println("total earnings:"+totalearnings);
	}

}
