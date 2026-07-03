package project1;

public class police { 
	
	@Override
    protected void finalize() throws Throwable {
		
	System.out.println("garbage collector is called");
}
	public static void main(String[] args) {
		police p = new police();
		p = null;
		System.out.println("object destroyed");
		System.out.println("P");
		System.gc();
	}

}
