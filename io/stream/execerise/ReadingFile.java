package io.stream.execerise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {
	public static void main(String[] args) throws FileNotFoundException {
		// file location path
		File f = new File(
				"C:\\\\\\\\Users\\\\\\\\SARAVANAN\\\\\\\\eclipse-workspace\\\\\\\\FirstJava\\\\\\\\src\\\\\\\\io\\\\\\\\stream\\\\\\\\execerise\\\\firstjava.txt");

		Scanner sc = new Scanner(f);
        System.out.println(sc.next());
        System.out.println(sc.next());
        System.out.println(sc.next());
        System.out.println(sc.next());
        System.out.println(sc.next());
	}

}
