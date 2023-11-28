package io.stream.execerise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Addition {
	public static void main(String[] args) throws FileNotFoundException {
		int n = 0;
		File f = new File("C:\\Users\\SARAVANAN\\eclipse-workspace\\FirstJava\\src\\io\\stream\\execerise\\test.txt");
		Scanner sc = new Scanner(f);
		while (sc.hasNext()) {
			n += sc.nextInt();

		}
		System.out.println(n);
	}
}
