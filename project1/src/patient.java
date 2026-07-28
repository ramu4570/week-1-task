import java.util.Scanner;
public class patient {
	String patient_name;
	int age;
	double room_charge_perday;
	byte no_of_days;
	double total_hospital_bill;
	
	patient(String patient_name,int age,double room_charge_perday,byte no_of_days){
		this.patient_name = patient_name;
		this.age =age;
		this.room_charge_perday = room_charge_perday;
		this.no_of_days =no_of_days;
		this.total_hospital_bill =total_hospital_bill;
	}
	
	void patientdetails() {
		System.out.println("patient_name:"+patient_name);
		System.out.println("age:"+age);
		System.out.println("room_charge_perday:"+room_charge_perday);
		System.out.println("no_of_days:"+no_of_days);
		
		total_hospital_bill= room_charge_perday*no_of_days;
		System.out.println("total_hospital_bill:"+total_hospital_bill);
	}

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the patient name:");
		String name = sc.nextLine();

		System.out.println("enter age:");
		int age = sc.nextInt();
		
		System.out.println("room charge per day:");
		double roomcharge = sc.nextDouble();
		
		System.out.println("no of days:");
		byte noofdays = sc.nextByte();
		
		patient p1 = new patient(name,age,roomcharge,noofdays);
		p1.patientdetails();
	}

}
