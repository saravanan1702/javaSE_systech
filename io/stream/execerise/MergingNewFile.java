package io.stream.execerise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MergingNewFile {
	public static void main(String[] args) throws IOException {
		File f1 = new File("myfile1.txt");
		File f2 = new File("text1.txt");
		File f3 = new File("merge.txt");
		FileWriter fw = new FileWriter("merge.txt");
		Scanner sc = new Scanner(f1);
		while (sc.hasNext()) {
			fw.write(String.valueOf(sc.nextInt()));
			fw.write("\n");
		}
		Scanner sc1 = new Scanner(f2);
		while (sc.hasNext()) {
			fw.write(String.valueOf(sc.nextInt()));
			fw.write("\n");
		}
		Scanner sc2 = new Scanner(f2);
		while (sc2.hasNext()) {
			fw.write(sc2.next());
			fw.write("\n");
		}
		System.out.println("Process Completed");
		fw.close();
	}
}
