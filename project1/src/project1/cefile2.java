package project1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class cefile2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		File f = new File("/Users/home/Desktop/java workspace/ram321.txt");
		FileReader fr = new FileReader(f);
		
		//reads single character
		int i = fr.read();
	    System.out.println(i);
		
		//reads all characters
		int i1 =fr.read();
		while(i1!=-1) {
			System.out.print((char)i1);
			Thread.sleep(500);
			i1 =fr.read();
		}
	}

}
