
public class arraystrings {

	public static void main(String[] args) {
		String [] names = new String[5];// declaration & creation has doen
		//now initilization
		names[0] = "ram";
		names[1] = "kong";
		names[2] = "king";
		names[3] = "sri";
		names[4] = "ravi";
		//representation
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		for(String name : names) {
			System.out.println(name);
		}
		for(int i=names.length-1; i>=0;i--) {//reverse of the names
			System.out.println(names[i]);
		}
		int [] arr = {1,2,3,4,5};//reverse of the numbers
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}

}
