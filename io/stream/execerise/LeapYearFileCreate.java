package io.stream.execerise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeapYearFileCreate {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\SARAVANAN\\eclipse-workspace\\FirstJava\\src\\io\\stream\\execerise\\leap.txt");
		if (f.createNewFile()) {
			System.out.println("File created");
		} else {
			System.out.println("File not Created");
		}
		FileWriter fw = new FileWriter(
				"C:\\Users\\SARAVANAN\\eclipse-workspace\\FirstJava\\src\\io\\stream\\execerise\\leap.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N value :");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The Year :");
			String year=sc.next();
			fw.write(year);
			fw.write("\n");
		}
		fw.close();
	}
}
