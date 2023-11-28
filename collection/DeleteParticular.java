package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteParticular {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int n, t;
		System.out.println("Enter The N value :");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			t = sc.nextInt();
			list.add(t);
		}
		System.out.println("List is :" + list);
//		System.out.println("Enter The address :");
//		int x = sc.nextInt();
		list.remove(3);
		System.out.println("Cuurent Array list :" + list);
	}
}
