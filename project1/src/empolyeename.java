
public class empolyeename {
	String employee;
	double salary;
	
	empolyeename(String employee,double salary){
		
		this.employee = employee;
		this.salary = salary;
		
		System.out.println("employeename:"+employee);
		System.out.println("salary:"+salary);

	}
}
	class manager extends empolyeename {
		String department;
		String experience;
		

		manager(String employee,double salary,String department,String experience){
			super(employee,salary);
			
			this.department = department;
			this.experience = experience;
			
			System.out.println("department:"+department);
			System.out.println("experience:"+experience);

		}

	  public static void main(String[] args) {
		  manager m1 =  new manager("ram",50000,"cse","3years"); 

	}

}
