package vector;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Vector;

public class PrintingValuesUsingCollection {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N :");
		int n = sc.nextInt();
		System.out.println("Vector ...");
		int i = 1;
		while (i <= n) {
			System.out.println("enter the value :");
			String val = sc.next();
			v.add(val);
			i++;

		}
		System.out.println("Collection ArrayList :");
		Collection c = new ArrayList<Integer>();
		// using vector in collection because vector is part of collection framework
		for (int y = 0; y < v.size(); y++) {
			System.out.println("Enter The value :");
			int t = sc.nextInt();
			c.add(t);
		}
		System.out.println("Vector Value is :" + v);
		System.out.println("Collection ArrayList is :" + c);
		v.addAll(c);
		System.out.println("final Vector is :" + v);

	}
}
