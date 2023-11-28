package io.stream.execerise;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) throws IOException {
		File x = new File("java.txt");
		if (x.createNewFile()) {
			System.out.println("File Created");
		} else {
			System.out.println("File Not Created");
		}
	}
}
