package io.stream.execerise;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharactorWriterExe {
	public static void main(String[] args) throws IOException {
		CharArrayWriter c = new CharArrayWriter();
		c.write("Java Programming");
		FileWriter f1 = new FileWriter("text1.txt");
		FileWriter f2 = new FileWriter("text2.txt");
		FileWriter f3 = new FileWriter("text3.txt");
		c.writeTo(f1);
		c.writeTo(f2);
		c.writeTo(f3);
		f1.close();
		f2.close();
		f3.close();
	}
}
