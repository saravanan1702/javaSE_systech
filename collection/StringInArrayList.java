package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StringInArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String t;
		ArrayList<String> list = new ArrayList<>();
		System.out.println("Enter The size of ArrayList :");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			t = sc.next();
			list.add(t);
		}
		System.out.println("Arraylis is :" + list);
		list.sort(Comparator.naturalOrder());
		System.out.println(list);

	}
}
