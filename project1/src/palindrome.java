import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String name = sc.nextLine();
		
		String original = name;
		String reverse = "";
		for(int i=name.length()-1;i>=0;i--) {
			reverse = reverse +name.charAt(i);
		}
		if(reverse.equals(original)) {
			System.out.println("palindrome string:"+original);
		}else {
			System.out.println("not a palindrome string:"+original);
		}
	}

}
