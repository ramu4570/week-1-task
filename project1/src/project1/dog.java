package project1;

public class dog implements animal {

	@Override
	public void sound() {
		System.out.println("dog say bow bow");
	}

	@Override
	public void walk() {
		System.out.println("dog walks cute");
	}

	@Override
	public void eat() {
		System.out.println("dog eats non veg");
	}
	
	public void run() {
		System.out.println("dogs run slow");
	}

}
class cat implements animal {
	
	public void sound() {
		System.out.println("cat say meoe bow");
	}
	
	public void walk() {
		System.out.println("cat walks catwalk");
	}
	
	public void eat() {
		System.out.println("cat eats rat veg");
	}
}
