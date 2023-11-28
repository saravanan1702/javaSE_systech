package vector;

import java.util.Scanner;
import java.util.Vector;

public class PrintingValues {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			System.out.println("Enter The value :");
			String s = sc.next();
			v.add(s);
			i += 1;
		}
		// v.size()=>total size of vector
		System.out.println("Vector values :");
		for (int x = 0; x < v.size(); x++) {
			System.out.println(v.get(x));
		}
	}

}
