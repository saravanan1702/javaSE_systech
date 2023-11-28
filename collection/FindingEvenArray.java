package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingEvenArray {
	public static void main(String[] args) {
		int n, a;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter The N number :");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			list.add(a);
		}
		System.out.println("list is :" + list);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				System.out.println(list.get(i) + " is Even");
			} else {
				System.out.println(list.get(i) + " is not Even");
			}
		}
	}
}
