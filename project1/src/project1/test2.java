package project1;

public class test2 {
	static {
		System.out.println("static block1 loaded");
	}
	static test2 t= new test2();
	public static void main(String[] args) { 
		System.out.println("main method loaded");
	}
	{
	System.out.println("instance block1 loaded");
	}
	static {
		System.out.println("static block2 loaded");
	}
	{
		System.out.println("instance block2 loaded");
	}
}
