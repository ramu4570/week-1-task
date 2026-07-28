
public class employee {
	int empid;
	String empname;
	double salary;
	
	employee(int empid,String empname,double salary){
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		
	}
	employee(employee e1){
		this.empid = e1.empid;
		this.empname = e1.empname;
		this.salary = e1.salary+1000;
	}
	
	void display(){
		System.out.println("employee id:"+empid);
		System.out.println("employee name:"+empname);
		System.out.println("employee salary:"+salary);
	}

	public static void main(String[] args) {
		
		System.out.println("employee1");
		employee e = new employee(101,"krishna",50000);
		e.display();
		
		System.out.println("employee2");
		employee e1 = new employee(e);
		e1.empname = "ravi";
		e1.display();
	}

}
