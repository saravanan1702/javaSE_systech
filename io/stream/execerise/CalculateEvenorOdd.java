package io.stream.execerise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CalculateEvenorOdd {
	public static void main(String[] args) throws IOException {
		int esum = 0;
		int oddsum = 0;
		File f = new File("myfile1.txt");
		Scanner sc = new Scanner(f);
		while (sc.hasNext()) {
			int r = sc.nextInt();
			if (r % 2 == 0) {
				System.out.println(r + " is Even Number ");
				esum += r;
			} else {
				System.out.println(r + " is odd Number");
				oddsum += r;
			}
		}
		File f1 = new File("even.txt");
		File f2 = new File("odd.txt");
		FileWriter fw1 = new FileWriter("even.txt");
		FileWriter fw2 = new FileWriter("odd.txt");
		fw1.write(String.valueOf(esum));
		fw2.write(String.valueOf(oddsum));
	}
}
