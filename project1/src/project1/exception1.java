package project1;
import java.util.*;

public class exception1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try{
		System.out.println("enter a firstnumber");
		String s1 = sc.nextLine();
		
		System.out.println("enter a secondnumber");
		String s2 = sc.nextLine();
		
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		
		System.out.println(num1/num2);
		
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			System.out.println("enter the array:"+i);
			arr[i] =sc.nextInt();
		}
		}		
		catch (ArithmeticException e){
			System.out.println("enter correct number!!");
		}
		
		catch (NumberFormatException e){
			System.out.println("enter correct format!!");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index");
		}
	}
}
