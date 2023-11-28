package io.stream.execerise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingfilewhileLoop {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("C:\\Users\\SARAVANAN\\eclipse-workspace\\FirstJava\\src\\io\\stream\\execerise\\firstjava.txt");
		Scanner sc = new Scanner(f);
		while (sc.hasNext()) {// is there any elements present in this file it will read line by line {
			System.out.println(sc.next());
		}

	}
}
