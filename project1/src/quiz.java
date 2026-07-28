
public class quiz {
	String subject;
	int totalquestions;
	float timelimit;
	
	quiz(){
		System.out.println("subject is hard");

	}
	quiz(String subject){
		this();
		this.subject = subject;
		System.out.println("subject is hindhi");
	}
	quiz(String subject,int totalquestions){
		this(subject);
		this.totalquestions = totalquestions;
		System.out.println("total questions in hindhi");

	}
	quiz(String subject,int totalquestions,float timelimit){
		this(subject,totalquestions);
		this.timelimit = timelimit;
		System.out.println("time limit is for questions");

		
		System.out.println("subject:"+subject);
		System.out.println("totalquestions:"+totalquestions);
		System.out.println("timelimit:"+timelimit);
	}

	public static void main(String[] args) {
		
		quiz q1 = new quiz("hindhi",20,55);

	}

}
