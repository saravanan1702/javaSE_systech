package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingDivisible {
	public static void main(String[] args) {
		int x, t;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter The N number :");
		x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			t = sc.nextInt();
			list.add(t);
		}
		System.out.println("List is :" + list);
		for (int i = 0; i < x; i++) {
			if (list.get(i) % 3 == 0) {
				System.out.println(list.get(i) + " is Divisible");
			} else {
				System.out.println(list.get(i) + "is not Divisible");
			}
		}
	}
}
