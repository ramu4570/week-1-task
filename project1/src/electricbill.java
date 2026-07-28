import java.util.Scanner;
public class electricbill {
	int consumer_no;
	String consumer_name;
	float units;
	String consumer_address;
	double bill;
	
	electricbill (){
		
	}
	electricbill (int consumer_no){
		this();
		this.consumer_no = consumer_no;
	}
	electricbill (int consumer_no,String consumer_name){
		this(consumer_no); 
		this.consumer_name = consumer_name;
	}
	electricbill (int consumer_no,String consumer_name,float units){
		this(consumer_no,consumer_name);
		this.units = units;
	}
	electricbill (int consumer_no,String consumer_name,float units,String consumer_address){
		this(consumer_no,consumer_name,units);
		this.consumer_address = consumer_address;
		
		if(units <= 100) {
			bill = units*2;
			
		}else if (units <= 200) {
		   bill = units*3;
		   
		}else {
			bill = units*5;
		}
	System.out.println("consumer_no:"+consumer_no);
	System.out.println("consumer_name:"+consumer_name);
	System.out.println("units:"+units);
	System.out.println("consumer_address:"+consumer_address);
	System.out.println("total bill:"+bill);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter consumer_no:");
		int no = sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter consumer_name:");
		String name = sc.nextLine();
		
		System.out.println("enter units:");
		float units = sc.nextFloat();
		sc.nextLine();
		
		System.out.println("enter consumer_address:");
		String address = sc.nextLine();
		
		electricbill eb = new electricbill(no,name,units,address);
	}

}
