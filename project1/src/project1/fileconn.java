package project1;

import java.io.File;
import java.io.IOException;

public class fileconn {

	public static void main(String[] args) throws IOException {
		File f = new File("/Users/home/Desktop/java workspace/ram321");
		boolean flag = f.mkdir();
		
		if(flag) {
			System.out.println("new directory creacted");
		}else {
			System.out.println("something went wrong");
		}
		File f1 =new File(f,"ram.txt");
		f1.createNewFile();
		
		File f2 =new File(f,"king.txt");
		f2.createNewFile();
		
		System.out.println(f1.canExecute());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getCanonicalPath());
		System.out.println(f1.getFreeSpace());
		System.out.println(f1.getTotalSpace());
		
		File f3 = new File("/Users/home/Desktop/java workspace/ram321");
		String[] files =f3.list();
		int count =0;
		
		for(String filename : files) {
			System.out.println(filename);
			count ++;
		}
		System.out.println("total files:"+count);
		System.out.println("total files:"+files.length);
	}

}
