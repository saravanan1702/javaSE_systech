package io.stream.execerise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OddorEven {
	public static void main(String[] args) throws FileNotFoundException {
		int n = 0;
		File f = new File(
				"C:\\Users\\SARAVANAN\\eclipse-workspace\\FirstJava\\src\\io\\stream\\execerise\\testfile.txt");
		Scanner sc = new Scanner(f);
		while (sc.hasNext()) {
			int r = sc.nextInt();
			if (r % 2 == 0) {
				System.out.println(r + " is Even Number");
			} else {
				System.out.println(r + " is Odd Number");
			}
		}
	}
}
