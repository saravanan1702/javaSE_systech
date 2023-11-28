package io.stream.execerise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class gettingWriterFile {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File(
				"C:\\Users\\SARAVANAN\\eclipse-workspace\\FirstJava\\src\\io\\stream\\execerise\\DemoFile2.txt");
		Scanner s = new Scanner(f);
		while (s.hasNext()) {
			System.out.println(s.next());
		}

	}
}
