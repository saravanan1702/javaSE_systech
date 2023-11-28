package io.stream.execerise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read4 {
	public static void main(String[] args) {
		try {
			File f = new File(
					"C:\\Users\\SARAVANAN\\eclipse-workspace\\FirstJava\\src\\io\\stream\\execerise\\firstjava.txt");
			Scanner sc = new Scanner(f);
			while (sc.hasNext()) {
				String s = sc.next();
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error");
		}
	}
}
