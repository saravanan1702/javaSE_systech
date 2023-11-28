package io.stream.execerise;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) throws IOException {
		// write something on the file
		FileWriter x = new FileWriter(
				"C:\\\\Users\\\\SARAVANAN\\\\eclipse-workspace\\\\FirstJava\\\\src\\\\io\\\\stream\\\\execerise\\\\abc.txt");
		x.write("Hello Welcome to Java Program");
		x.close();
	}
}
