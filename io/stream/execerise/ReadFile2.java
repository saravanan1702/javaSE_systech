package io.stream.execerise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile2 {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File(
				"C:\\Users\\SARAVANAN\\eclipse-workspace\\FirstJava\\src\\io\\stream\\execerise\\firstjava.txt");
		Scanner sc = new Scanner(f);
		while (sc.hasNext()) {
			String data = sc.next();// store files in String variable
			System.out.println(data);// then print the data
		}
	}
}
