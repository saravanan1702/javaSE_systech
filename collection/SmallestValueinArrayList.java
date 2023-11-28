package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class SmallestValueinArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int x, t;
		System.out.println("Enter The size of Array List ");
		x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.print("Enter The value of Array list :" + i + ":");
			t = sc.nextInt();
			list.add(t);
		}
		System.out.println("Array List :");
//		for (int z : list) {
//			System.out.print(z+" ");
//		}
		System.out.println(list);
		System.out.println();
		int a = list.get(0);
		for (int i = 0; i < x; i++) {
			if (list.get(i) < a) {
				a = list.get(i);
			}
		}
		System.out.println("Smallest value in this ArrayList is :" + a);
	}
}
