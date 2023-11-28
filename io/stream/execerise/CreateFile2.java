package io.stream.execerise;

import java.io.File;
import java.io.IOException;

public class CreateFile2 {
	public static void main(String[] args) throws IOException {
		// creating file specific place
		File f = new File("C:\\Users\\SARAVANAN\\eclipse-workspace\\FirstJava\\src\\io\\stream\\execerise\\abc.txt");
		if (f.createNewFile()) {
			System.out.println("File Created");
		} else {
			System.out.println("File not Created");
		}

	}
}
