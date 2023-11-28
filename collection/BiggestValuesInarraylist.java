package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class BiggestValuesInarraylist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int x, t;
		System.out.println("Enter The value of ArrayList size :");
		x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.println("Enter The element of arraylist");
			t = sc.nextInt();
			list.add(t);
		}
		System.out.println("Arraylist is :" + list);
		int y = list.get(0);
		for (int i = 0; i < x; i++) {
			if (list.get(i) > y) {
				y = list.get(i);
			}
		}
		System.out.println("Biggest element in this arraylist is :" + y);
	}
}
