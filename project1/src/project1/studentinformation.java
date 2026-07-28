package project1;

public class studentinformation {

	 void main(String[] args) {
		 education("high school","9thclass");
		 marks("25","65","97");
		 parentsinfo("TENALI","kami");
		 }
		void education(String schoolname,String standard ) {
			System.out.println("school:"+schoolname);
			System.out.println("class:"+standard);
			System.out.println("student_id:101");
		}
		void marks(String hindhi,String english ,String social) {
			System.out.println("hindhi:"+hindhi);
			System.out.println("english:"+english);
			System.out.println("social:"+social);
		}
		void parentsinfo(String father, String mother) {
			System.out.println("father:"+father);
			System.out.println("mother:"+mother);
		}

}
