package project1;
import java.io.File;
import java.io.IOException;
public class cefile1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		File f = new File("/Users/home/Desktop/java workspace/ram321.docx");
		
		try {
			boolean status = f.createNewFile();
			if(status) {
				System.out.println("file has created");
			}else {
				System.out.println("created it before");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("main method ended");
	}

}
