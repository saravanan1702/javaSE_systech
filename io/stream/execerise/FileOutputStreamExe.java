package io.stream.execerise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExe {
	public static void main(String[] args) throws IOException {
		File x=new File("output001.txt");
		if(x.createNewFile())
			System.out.println("created");
		FileOutputStream f = new FileOutputStream(
			"output001.txt");
		f.write(67);
		f.close();
	}
}
