package stackandlilnkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class ChangeParticularValueInLinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N value :");
		LinkedList<Integer> list = new LinkedList<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the Data :");
			int a = sc.nextInt();
			list.add(a);
		}
		System.out.println("Stack is :" + list);
		System.out.println("Enter The Finding value :");
		int t = sc.nextInt();
		System.out.println("Enter The latest Value :");
		int s = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (list.get(i) == t) {
				list.set(i, s);
			}
		}
		System.out.println("After Updated new linked list :" + list);
	}
}
