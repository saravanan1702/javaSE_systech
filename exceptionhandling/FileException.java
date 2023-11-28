package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileException {
	public static void main(String[] args) {
		try {
			File file = new File("file123.txt");
			FileReader fr = new FileReader(file);
			System.out.println("File is Available");

		} catch (FileNotFoundException e) {
			System.out.println("File Doesn't exist");
		}
	}
}
