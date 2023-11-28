package io.stream.execerise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingStudentDataFile {
	public static void main(String[] args) throws IOException {
		File f1 = new File("studentData.txt");//creating file 
		FileWriter fw = new FileWriter("studentData.txt");//writing file or (input values) that we crate earlier
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//how many student data we want to store it
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The Student Name :");
			String name = sc.next();
			System.out.println("Enter The Subject 1 :");
			int m1 = sc.nextInt();
			System.out.println("Enter the Subject 2 :");
			int m2 = sc.nextInt();
			System.out.println("Enter the Subject 3 :");
			int m3 = sc.nextInt();

			int sum = m1 + m2 + m3;
			System.out.println("Hi, " + name + " Your mark is " + sum);
			fw.write(String.valueOf(name));
			fw.write("\n");
			fw.write(String.valueOf(sum));
			fw.write("\n");

		}
		fw.close();
	}
}
