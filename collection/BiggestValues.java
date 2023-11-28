package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class BiggestValues {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> data = new ArrayList<>();
		System.out.println("Enter The  N:");
		int n = sc.nextInt();
		int t;
		for (int i = 0; i < n; i++) {
			t = sc.nextInt();
			data.add(t);
		}
		System.out.println("list is :" + data);
		int x = data.get(0);
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i) > x) {
				x = data.get(i);
			}
		}
		System.out.println("Biggest Value is :" + x);
	}
}
