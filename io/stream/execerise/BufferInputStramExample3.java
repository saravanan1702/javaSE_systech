package io.stream.execerise;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInputStramExample3 {
	public static void main(String[] args) throws IOException {
		FileOutputStream f=new FileOutputStream("output1.txt");
		BufferedOutputStream b=new BufferedOutputStream(f);
		String s="Java Programming 123 ";
    	byte c[]=s.getBytes();
    	b.write(c);
    	b.write(c, 0, 0);
    	b.close();
    	f.close();
	}
}
