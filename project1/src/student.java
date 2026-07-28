import java.util.Scanner;
public class student {
	int id;
	String name;
	String course;
	student(){
		
	}
	student(int id){
		this();
		this.id = id;
	}
	student(int id, String name){ 
		this(id);
		this.id = id;
		this.name = name;
	} 
	student(int id, String name, String course){
		this(id,name);
		this.name = name;
		this.course = course;
		
		System.out.println("Student Id : "+id);
		System.out.println("Student name : "+name);
		System.out.println("Student course : "+course);
		
	}
	
	
	public static void main(String[] args) {
		 student s1 = new student(1, "Hello", "JSV");
		 }

}
