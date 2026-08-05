import java.util.Scanner;
public class alphabets {
	static void alpha() {
		for(char ch='Z'; ch>='A'; ch--) {
		System.out.println(ch +" ");
	}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a alphabet");
		String alpha = sc.nextLine();
		alpha();
	}

}
