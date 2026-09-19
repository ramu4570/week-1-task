package project1;

public interface animal {
	
	void sound();
	
	void walk();
	
	void eat();
	
	default void run() {
		System.out.println("runs fast");
	}

}
