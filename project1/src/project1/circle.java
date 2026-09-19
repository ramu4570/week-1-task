package project1;
import java.util.*;
public class circle extends shape {
	@Override
	void area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter circle radius:");
		double r = sc.nextDouble();
		System.out.println("area of circle:"+Math.PI *r*r);
	}
}
	class rectangl extends shape{

		@Override
		void area() {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter rectangle length:");
			double l = sc.nextDouble();
			
			System.out.println("enter rectangle breadth:");
			double b = sc.nextDouble();
			System.out.println("area of rectangle:"+l*b);
		}
		
	}
	class triangle extends shape{

		@Override
		void area() {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter triangle length");
			double l = sc.nextDouble();
			
			System.out.println("enter triangle breadth");
			double b = sc.nextDouble();
			System.out.println("area of triangle:"+0.5 *l*b);
			
		}
		
	}

