//count how many a are there in a string
public class string {

	public static void main(String[] args) {
		String s ="banana";
		int count =0;
		for(int i =0;i< s.length(); i++) {
			if(s.charAt(i)=='a') {
				count = count +1;
			}
		}
		System.out.println("numbers of a's:"+count);
	}

}
