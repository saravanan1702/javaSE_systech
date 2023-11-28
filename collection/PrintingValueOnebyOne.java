package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintingValueOnebyOne {
	public static void main(String[] args) {
		int n, a;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter the size of array :");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			list.add(a);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

	}
}
