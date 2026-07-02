package project1;

public class test5 {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("gargbage collection done");
	}
	static int count=0;
	{
		count+=1;
	}
	public static void main(String[] args) {
		new test5();
		new test5();
		new test5();
		new test5();
		new test5();
	System.out.println("no.of times called:"+count);
	System.gc();
	}

}
