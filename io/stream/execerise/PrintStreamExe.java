package io.stream.execerise;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamExe {
	public static void main(String[] args) throws IOException {
       FileOutputStream f=new FileOutputStream("text1.txt");
       PrintStream p=new PrintStream(f);
       p.print(2016);
       p.print("Welcome");
       f.close();
       p.close();
	}
}
