package io.stream.execerise;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferInputStreanDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("output1.txt");
		BufferedInputStream b = new BufferedInputStream(f);
		int i;
		while ((i = b.read()) != -1) {
			System.out.print((char) i);
		}
		b.close();
		f.close();
	}

}
