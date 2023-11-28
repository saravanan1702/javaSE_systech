package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class CountingNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		int n, t, count = 0;
		System.out.println("Enter The N :");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			t = sc.nextInt();
			a.add(t);
		}
		System.out.println(a);
		System.out.println("Enter The counting value :");
		int x = sc.nextInt();
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) == x) {
				count += 1;
			}
		}
		System.out.println("Count is :" + count);
	}
}
