//using constructor chaining
public class book {
	String title;
	String author;
	Double price;
	
	book(){
		this("unknow");
	}
	book(String title){
		this(title,"unknow");
	}
	book(String title,String author){
		this(title,author,0.0);
	}
	book(String title,String author,Double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void display() {
		System.out.println("book title:"+title);
		System.out.println("book aurthor:"+author);
		System.out.println("book price:"+price);
	}
     void main(String[] args) {
    	 
    	 book b1 = new book();
    	 b1.display();
    	 System.out.println("*******");
    	 
    	 book b2 = new book ("vcube");
    	 b2.display();
    	 System.out.println("*******");
    	 
    	 book b3 = new book ("vcube","srikanth");
    	 b3.display();
    	 System.out.println("*******");
    	 
    	 book b4 = new book ("vcube","srikanth",39990.0);
    	 b4.display();
    	 System.out.println("*******");
	}

}
