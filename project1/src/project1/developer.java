package project1;

public class developer implements attendence {

	@Override
	public void markattendence() {
		System.out.println("emp =1 attendence is 80");
	}
}
class tester implements attendence {

	@Override
	public void markattendence() {
		System.out.println("emp =2 attendence is 70");
		
	}
	
}

class manager implements attendence{

	@Override
	public void markattendence() {
		System.out.println("emp =3 attendence is 90");
		
	}
	
}

