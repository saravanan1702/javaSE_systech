package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class AssendingOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int n, t;
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			t = sc.nextInt();
			list.add(t);
		}
		System.out.println("Array List :" + list);
		System.out.println();
		list.sort(Comparator.naturalOrder());
		System.out.println("ArrayList Sorting :" + list);
	}
}
