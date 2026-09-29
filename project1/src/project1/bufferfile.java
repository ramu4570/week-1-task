package project1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class bufferfile {

	public static void main(String[] args) throws IOException {
		//used to write the characters to the file
		
		FileWriter fw = new FileWriter("/Users/home/Desktop/java workspace/ram321/satish.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("shoba");
		bw.newLine();
		bw.write("mom");
		bw.newLine();
		//bw.write("to3jh387h");
		bw.close();
		
		FileWriter fw2 = new FileWriter("/Users/home/Desktop/java workspace/ram321/satish.txt",true);

		
		PrintWriter pw = new PrintWriter(fw2);
		pw.println(123);
		pw.println("jbife");
		pw.println('j');
		pw.println(123.4f);
		pw.close();

	}

}
