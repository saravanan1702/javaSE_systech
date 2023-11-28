package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ChangingValuesinArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int n, t;
		System.out.println("Enter the n :");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			t = sc.nextInt();
			list.add(t);
		}
		System.out.println("list is :" + list);
		System.out.println("Enter the ArrayList Value :");
		int a = sc.nextInt();
		System.out.println("Enter The value that you want to update :");
		int x = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (list.get(i) == a) {
				list.set(i, x);
			}
		}
		System.out.println("Updated list is :" + list);
	}
}
