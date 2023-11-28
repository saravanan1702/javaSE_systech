package stackandlilnkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class FindingTheParticularValue {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Value :");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The value :");
			int val = sc.nextInt();
			list.add(val);
		}
		System.out.println("Stack Value is :" + list);
		System.out.println("Enter The Finding Value :");
		int x = sc.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == x) {
				System.out.println(i + " Available");
			} else {
				System.out.println(i + " not Available");
			}
		}
	}
}
