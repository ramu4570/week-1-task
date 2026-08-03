import java .util.Scanner;
public class jobeligibilty {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter ur name:");
		String name = sc.nextLine();
		
		System.out.println("enter ur 10th marks:");
		int marks = sc.nextInt();
		if (marks>=500 && marks<=1000) {
			System.out.println("your eligibile!!");
			
			System.out.println("enter ur inter result:");
			int result = sc.nextInt();
			if (result>700 && result <1000) {
			System.out.println("good results");	
			
			System.out.println("ur b.tech cgpa");
			float cgpa = sc.nextFloat();
			if(cgpa>6.0 && cgpa<10.0) {
				System.out.println("good cgpa");
				
				System.out.println("enter ur age");
				int age = sc.nextInt();
				if (age>21 && age<30) {
					System.out.println("ok");
					sc.nextLine();
					
					System.out.println("enter ur skill(java/python)");
					String skill = sc.nextLine();
					if(skill.equals("java") || skill.equals("python")) {
						System.out.println("good ur required");
					}else {
						System.out.println("oh no required skilled not found");
					}
				}else {
					System.out.println("not ok");
				}
			}else {
				System.out.println("need to improve");
			}
			}else {
				System.out.println("poor results");	
			}
			}else {
			System.out.println("your not eligible!!");
		}
		
	}

}
