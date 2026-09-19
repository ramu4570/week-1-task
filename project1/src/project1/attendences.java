package project1;

public class attendences {

	public static void main(String[] args) {
		
		attendence d= new developer();
		d.markattendence();
		
		attendence t= new tester();
		t.markattendence();
		
		attendence m= new manager();
		m.markattendence();
	}

}
