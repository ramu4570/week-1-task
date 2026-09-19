
public class findarea {
	//area of triangle
	double findarea(double b ,double h) {
		return 0.5 * b * h;
	}
	//area of rectangle
	double findarea(double l,float b) {
		return l*b;
	}
	//area of square
	double findarea(double s) {
		return s*s;
	}
	//area of circle
	double findarea(float r) {
		return Math.PI*r*r;
	}

   void main(String[] args) {
		System.out.println("triangle area is:"+findarea(10.5,23.5));
		System.out.println("rectangle area is:"+findarea(10,30));
		System.out.println("square area is:"+findarea(55));
		System.out.println("circle area is:"+findarea(10));
	}

}
