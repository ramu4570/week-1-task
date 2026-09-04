package project1;

public class studentget {

	public static void main(String[] args) {
		studentset sd = new studentset();
		sd.setSid(501);
		sd.setSname("panja");
		sd.setSalary(500000);
		sd.setSpassword("fty455");
		
		System.out.println("student id :"+sd.getsid());
		System.out.println("student name :"+sd.getsname());
		System.out.println("student salary:"+sd.getsalary());
		System.out.println("student password:"+sd.getspassword());
				
	}

}
