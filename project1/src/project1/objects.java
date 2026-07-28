package project1;

public class objects {
	
	public static void main(String[] args) {
		String sb1 = ("6258");
		int num1 = Integer.parseInt(sb1);
		double  d1= Double.parseDouble(sb1);
		float f1 = Float.parseFloat(sb1);
		int primitive =58494;
		Integer wrapper = primitive;
		int value = wrapper;
		
		System.out.println(primitive);
		System.out.println(wrapper);
		System.out.println(value);
		System.out.println(sb1);
		System.out.println(num1);
		System.out.println(d1);
		System.out.println(f1);
	}

}
