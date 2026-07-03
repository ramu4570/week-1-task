package project1;

public class worker {
	static String companyname="vcube";
    static String location ="hyderabad";
	String workername;
	int salary;
	
	
	public static void main(String[] args) {
		
		worker w1= new worker();
		w1.workername = "ramu";
		w1.salary = 2900;
		
		worker w2= new worker();
		w2.workername = "satish";
		w2.salary = 20;
		
		System.out.println("worker1 info");
		System.out.println("companyname:"+companyname);
		System.out.println("location:"+location);
		System.out.println("workername:"+w1.workername);
		System.out.println("salary:"+w1.salary);
		
		System.out.println("worker2 info");
		System.out.println("companyname:"+companyname);
		System.out.println("location:"+location);
		System.out.println("workername:"+w2.workername);
		System.out.println("salary:"+w2.salary);
	}

}
