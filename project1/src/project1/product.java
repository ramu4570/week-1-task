package project1;

public class product {
	int product_id;
	String product_name;
	double product_price;
	
	product(int product_id,String product_name,double product_price) {
		this.product_id=product_id;
		this.product_name=product_name;
		this.product_price=product_price;
	}
	 
	void show()
	{
		System.out.println("product_id:"+product_id);
		System.out.println("product_name:"+product_name);
		System.out.println("product_price:"+product_price);
		System.out.println("**********");
	}
	public static void main(String[] args) {
	
		product p = new product(1, "zudio",3000);
		product p1 = new product(2,"praneeth",40000);
		product p2 = new product(3,"ygfi",8900);
		
		p.show();
		p1.show();
		p2.show();
		
		
		
		}

}
