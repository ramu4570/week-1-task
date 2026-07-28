import java.util.Scanner;

public class product {
	String productname;
	double price;
	int quantity;
	float totalcost;
	
	product(){
		
	}
	product(String productname){
		this();
		this.productname = productname;
		
	}
    product(String productname,double price){
		this(productname);
		this.price = price;
	}
    product(String productname,double price,int quantity){
		this(productname,price);
		this.quantity = quantity;
		
		System.out.println("productname:"+productname);
		System.out.println("price:"+price);
		System.out.println("quantity:"+quantity);
		totalcost =(float) (price*quantity);
		System.out.println("total cost:"+totalcost);
	} 

	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter product name:");
		String name = sc.nextLine();
		
		System.out.println("enter product price:");
		double price = sc.nextDouble();
		
		System.out.println("enter product quantity:");
		int quantity = sc.nextInt(); 
		
		product pr = new product(name,price,quantity);
	}

}
