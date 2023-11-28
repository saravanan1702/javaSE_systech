package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ReverseOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			list.add(temp);
		}
		System.out.println("ArrayList :" + list);
		list.sort(Comparator.reverseOrder());
		System.out.println("ArrayList Reverse Order :" + list);
	}
}
