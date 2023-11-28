package io.stream.execerise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateAndWriteInIOStream {
	public static void main(String[] args) throws IOException {
		File x = new File("C:\\Users\\SARAVANAN\\eclipse-workspace\\FirstJava\\src\\io\\stream\\execerise\\test.txt");
		if (x.createNewFile()) {
			System.out.println("File Created");
		} else {
			System.out.println("File Not Created");
		}
		FileWriter f1 = new FileWriter(
				"C:\\\\Users\\\\SARAVANAN\\\\eclipse-workspace\\\\FirstJava\\\\src\\\\io\\\\stream\\\\execerise\\\\test.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Text");
		String str = sc.next();
		f1.write(str);
		f1.close();
	}
}
