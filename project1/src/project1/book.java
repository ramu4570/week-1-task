package project1;

class book {
	void display() {
		System.out.println("this is book");
	}
}

class magazine {

	void dispaly() {
		System.out.println("this is magazine");
	}
}

class main {

	public static void main(String[] args) {

		Object obj = new magazine();
		try {
			book b = (book) obj;
			b.display();
		} catch (ClassCastException e) {
			System.out.println("cannot cast");
		}
	}

}
