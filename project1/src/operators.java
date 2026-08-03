
public class operators {

	public static void main(String[] args) {
//arithmetic operators
		int a = 8;
		int b = 3;
		 
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		int mod = a%b;
		
		System.out.println("sum is:"+sum);
		System.out.println("subtraction is:"+sub);
		System.out.println("mutiply is:"+mul);
		System.out.println("division is:"+div);
		System.out.println("modules is:"+mod);
		System.out.println("**************");
//relational operators
		int a1 = 8;
		int b1 = 3;
		
		boolean greater = (a1 < b1); 
		System.out.println(greater);
		
		boolean lesser = (a1 > b1); 
		System.out.println(lesser);
		
		boolean greaterthanequal = (a1 <= b1); 
		System.out.println(greaterthanequal);
		
		boolean lesserthanequal = (a1 >= b1); 
		System.out.println(lesserthanequal);
		
		boolean equal = (a1 == b1); 
		System.out.println(equal);
		
		boolean notequal = (a1 != b1); 
		System.out.println(notequal);
	}

}
