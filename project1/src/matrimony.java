import java.util.Scanner;
public class matrimony {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("what is your name");
		String name = sc.nextLine();
		
		System.out.println("what are your assets");
		double assets = sc.nextDouble();
		
		System.out.println("what are your salary");
		double salary = sc.nextDouble();
		if(assets>=500000 && salary>=200000) {
			System.out.println("ok lets continue");
			
			System.out.println("enter your age:");
			int age = sc.nextInt();
			if(age>=26 && age<30) {
				System.out.println("oh.. so young");
				
				System.out.println("enter ur height");
				double height = sc.nextDouble();
				System.out.println("enter ur weight");
				double weight = sc.nextDouble();
				
				if ((height>=5.5 && height<=6.0) &&(weight>=60 &&weight<=80)) {
					System.out.println("oh good personality");
					
					System.out.println("are u teatotler (yes/no)");
					boolean teatotler = sc.nextBoolean();
					if(teatotler) {
						System.out.println("ok good boy");
						
						System.out.println("do u have sibilings (yes/no)");
						boolean sibilings = sc.nextBoolean();
						if (sibilings) {
							System.out.println("oh.. good");
						}else {
							System.out.println("assets belongs to u");
						}
					}else {
						System.out.println("oh no bad boy");
					}
				}else {
					System.out.println("build ur personality");
				}
			}else {
				System.out.println("oh.. so old");
			}
		}else {
			System.out.println("ok leave");
		}
	}
}
