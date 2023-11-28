package io.stream.execerise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream {
	public static void main(String[] args) throws IOException {
     FileInputStream f=new FileInputStream("output1.txt");
     int i=f.read();
     System.out.println((char)i);
     f.close();
     
	}
}
