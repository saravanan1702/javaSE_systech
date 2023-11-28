package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class FindTheParticularWord {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		int n, f = 0;
		String t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The size of ArrayList :");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			t = sc.next();
			list.add(t);
		}
		System.out.println("list is :" + list);
		System.out.println("Enter The Particular Word :");
		String a = sc.next();
		for (int i = 0; i < n; i++) {
			if (a.equals(list.get(i))) {
				System.out.println(list.get(i) + " is available");
			} else {
				System.out.println(list.get(i) + " is not available");
			}
		}
	}
}
