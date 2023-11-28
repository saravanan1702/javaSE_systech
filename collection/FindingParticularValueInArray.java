package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingParticularValueInArray {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int x, t;
		System.out.println("Enter The value of x :");
		x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.println("Enter The element of ArrayList :");
			t = sc.nextInt();
			list.add(t);
		}
		System.out.println("List is :" + list);
		System.out.println("Enter the value :");
		int a = sc.nextInt();
		for (int i = 0; i < x; i++) {
			if (list.get(i) == a) {
				System.out.println(list.get(i) + " is Available");
			} else {
				System.out.println(list.get(i) + " is not available");
			}
		}

	}
}
