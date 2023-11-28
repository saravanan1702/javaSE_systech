package io.stream.execerise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DemoFileDelete {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File(
				"C:\\Users\\SARAVANAN\\eclipse-workspace\\FirstJava\\src\\io\\stream\\execerise\\DemoFile2.txt");
		Scanner sc = new Scanner(f);//getting output from this file class
		while (sc.hasNext()) {
			System.out.println(sc.next());
		}
	    f.delete();
		System.out.println(sc.next());

	}
}
