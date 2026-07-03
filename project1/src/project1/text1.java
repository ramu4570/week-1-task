package project1;

public class text1 {
	public static void main(String[] args) {
		System.out.println("main method started");
		text1 t= new text1();
		hello();
		t.welcome();
		king();
		t.wedding();
	}
	static void hello() {
		System.out.println("hello ramu");
	}
    void welcome() {
		System.out.println("welcome to new world");
	}
    static void king() {
    	System.out.println("king is back");
    }
    void wedding() {
    	System.out.println("wedding getting soon");
    }
}
