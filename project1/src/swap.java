//swapping of two numbers
public class swap {

	public static void main(String[] args) {
		//without third variable
		int a = 10;
		int b = 20;
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		//with third variable
		int a1 = 30;
		int b1 = 50;
		
		int temp = a1;
		a1 = b1;
		b1 = temp;
		
		
		System.out.println("a1:"+(a1+b1));
		System.out.println("b1:"+b1);
	}	
	

}
