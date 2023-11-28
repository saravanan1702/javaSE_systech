package io.stream.execerise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingSumofNumberinFile {
	public static void main(String[] args) throws IOException {
		int n = 0;
		File f = new File("myfile1.txt");
		File f2 = new File("sum.txt");
		FileWriter p = new FileWriter("sum.txt");
		Scanner sc = new Scanner(f);
		while (sc.hasNext()) {
			n = n + sc.nextInt();
		}
		System.out.println(n);
		p.write(String.valueOf(n));
		p.close();
	}
}
