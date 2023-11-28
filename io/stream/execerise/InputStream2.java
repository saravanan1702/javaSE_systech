package io.stream.execerise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream2 {
	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("output1.txt");
		int i = 0;
		while ((i = f.read()) != -1) {
			System.out.print((char) i);
		}
		f.close();
	}
}
