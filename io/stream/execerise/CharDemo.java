package io.stream.execerise;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharDemo {
	public static void main(String[] args) throws IOException {
		char[] a = { 'a', 'b', 'c' };
		CharArrayReader r = new CharArrayReader(a);
		int k = 0;
		while ((k = r.read()) != -1) {
			char c = (char) k;
			System.out.print(c);

		}
	}
}
