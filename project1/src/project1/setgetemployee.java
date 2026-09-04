package project1;

public class setgetemployee {

	public static void main(String[] args) {
		setandget e1 = new setandget();
		e1.setEid(102);
		e1.setEname("kong");
		e1.setSalary(10000);
		
		System.out.println("eid:"+e1.getEid());
		System.out.println("ename:"+e1.getEname());
		System.out.println("esalary:"+e1.getSalary());
	}

}
