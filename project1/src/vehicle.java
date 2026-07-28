
public class vehicle {
	String vechiles;
	String company;
	
	vehicle(String vechiles,String company){
		this.vechiles = vechiles;
		this.company = company;
		
		System.out.println("vechile:"+vechiles);
		System.out.println("company:"+company);
	}
}
	class car extends vehicle{
		String model;
		double price;
		
		car(String vehicles,String company,String model,double price){
			super(vehicles,company);
			
			this.model = model;
			this.price = price;
			
			System.out.println("model:"+model);
			System.out.println("price:"+price);

		}
		

	public static void main(String[] args) {		
		car c1 = new car("saffari","tata","ev20s",250000);

	}
}

