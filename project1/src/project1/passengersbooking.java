package project1;
import java.util.*;
public class passengersbooking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String passengerid = "3";
		String age = "24";
		String seatnumber = "345";
		int no_of_passengers = 3;
		String[] passengers = {"rem,hong,nagw"};
		
		Object[]passengersdata = {"rem",34,200};
		
		try {
			int id = Integer.parseInt(passengerid);
			int age1 = Integer.parseInt(age);
			
			System.out.println("id"+id);
			System.out.println("age"+age);
		}
		catch(NumberFormatException e){
			System.out.println("invalid passenger");
		}
		try {
			int index=1;
			System.out.println("passenger"+passengers[index]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index");
		}
		try {
			String name= "rem";
			System.out.println("charcter:"+name.charAt(2));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("invalid st index");
		}
		
		try {
			Object value = passengersdata[3];
			Integer passengerAge =(Integer) value;
			System.out.println("passenger age"+age);
		}
		catch(ClassCastException e) {
			System.out.println("invalid object type");
		}
		}

}
