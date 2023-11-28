package io.stream.execerise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StoringEvenandOddNumberinFileInputStream {
	public static void main(String[] args) throws IOException {
		File f1 = new File("myfile1.txt");
		File f2 = new File("even.txt");
		File f3 = new File("odd.txt");
		FileWriter fw1 = new FileWriter("even.txt");
		FileWriter fw2 = new FileWriter("odd.txt");
		Scanner sc = new Scanner(f1);
		while (sc.hasNext()) {
			int r = sc.nextInt();
			if (r % 2 == 0) {
				System.out.println(r + " is even");
				fw1.write(String.valueOf(r));
				fw1.write("\n");
			} else {
				System.out.println(r + " is Odd ");
				fw2.write(String.valueOf(r));
				fw2.write("\n");

			}
		}
		fw1.close();
		fw2.close();

	}
}
