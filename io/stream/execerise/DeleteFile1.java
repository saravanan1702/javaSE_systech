package io.stream.execerise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DeleteFile1 {
	public static void main(String[] args) throws IOException {
		//creating new file for delete this file in demofile Deleter class
		File f = new File(
				"C:\\Users\\SARAVANAN\\eclipse-workspace\\FirstJava\\src\\io\\stream\\execerise\\DemoFile2.txt");
		if (f.createNewFile()) {
			System.out.println("File created Successfully");
		} else {
			System.out.println("File not Created");
		}
		FileWriter fw = new FileWriter(
				"C:\\Users\\SARAVANAN\\eclipse-workspace\\FirstJava\\src\\io\\stream\\execerise\\DemoFile2.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the N value :");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("enter Any text:");
			String str = sc.next();
			fw.write(str);
			fw.write("\n");
		}
		fw.close();

	}
}
