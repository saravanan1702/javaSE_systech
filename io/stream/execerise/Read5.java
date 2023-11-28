package io.stream.execerise;

import java.io.File;

public class Read5 {
	public static void main(String[] args) {
		File f = new File(
				"C:\\Users\\SARAVANAN\\eclipse-workspace\\FirstJava\\src\\io\\stream\\execerise\\firstjava.txt");
		if (f.exists()) {
			System.out.println("File Name is :" + f.getName());
			System.out.println("File location :" + f.getPath());
			System.out.println("File Read Permission :" + f.canRead());
			System.out.println("File Write Permission :" + f.canWrite());
			System.out.println("File size :" + f.length());
		}else {
			System.out.println("Error");
		}
	}
}
