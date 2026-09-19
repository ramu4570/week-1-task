
public class additionvararg {

	 void main(String...args) {
		add("a",10,20);
		add("b",10,20,30);
		add("c",10,20,30,40);
		add("d",10,20,30,40,50);
		add("e",10,20,30,40,50,60);
	}
	 void add(String s,int... a) {
		 int sum =0;
		 for(int a1:a) {
			 sum = sum+a1;
		 }
		 System.out.println("sum is:"+sum +"-->"+s);
	 }

}
