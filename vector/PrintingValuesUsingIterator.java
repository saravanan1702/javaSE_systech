package vector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PrintingValuesUsingIterator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("Enter The N :");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The Values :");
			int a = sc.nextInt();
			al.add(a);

		}
		System.out.println("ArrayList :" + al);
		Iterator i = al.iterator();
		while (i.hasNext()) {
			int x = (int) i.next();
			System.out.println(x);
		}
	}
}
