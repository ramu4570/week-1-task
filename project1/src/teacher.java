
public class teacher {
	int rollno;
	String name;
	double marks;
	
	teacher(int rollno,String name,double marks){
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	teacher(teacher t1){
		this.rollno = t1.rollno;
		this.name = t1.name;
		this.marks = t1.marks+100;
	}
	void dispaly() {
		System.out.println("teacher rollno:"+rollno);
		System.out.println("teacher name:"+name);
		System.out.println("teacher marks:"+marks);
	}

	public static void main(String[] args) {
		
		teacher t = new teacher(501,"delulu",200);
		t.dispaly();
		
		teacher t1 = new teacher(t);
		t1.name = "ramaya";
		t1.dispaly();
	}

}
