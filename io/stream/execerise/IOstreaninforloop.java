package io.stream.execerise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOstreaninforloop {
	public static void main(String[] args) throws IOException {
		File f = new File(
				"C:\\\\Users\\\\SARAVANAN\\\\eclipse-workspace\\\\FirstJava\\\\src\\\\io\\\\stream\\\\execerise\\firstjava.txt");
		if (f.createNewFile()) {
			System.out.println("File Created Successfully");
		} else {
			System.out.println("File NOt Created");
		}
		FileWriter fw = new FileWriter(
				"C:\\\\\\\\Users\\\\\\\\SARAVANAN\\\\\\\\eclipse-workspace\\\\\\\\FirstJava\\\\\\\\src\\\\\\\\io\\\\\\\\stream\\\\\\\\execerise\\\\firstjava.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N number :");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Any Text :");
			String str = sc.next();
			fw.write(str);
			fw.write("\n");// for string move to next line

		}
		fw.close();
	}
}
