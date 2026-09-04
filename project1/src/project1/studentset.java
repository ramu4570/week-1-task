package project1;

public class studentset {
	private int sid;
	private String sname;
	private double salary;
	private String spassword;
	//setters
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}
	//getters
	public int getsid() {
		return sid;
	}
	public String getsname() {
		return sname;
	}
	public double getsalary() {
		return salary;
	}
	public String getspassword() {
		return spassword;
	}

}
