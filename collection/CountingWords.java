package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class CountingWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, c = 0;
		String t;
		ArrayList<String> list = new ArrayList<>();
		System.out.println("Enter The N value :");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The Word :");
			t = sc.next();
			list.add(t);
		}
		int i;
		System.out.println("list is :" + list);
		System.out.println("Enter The Word :");
		String a = sc.next();
		for ( i = 0; i < n; i++) {
			if (a.equals(list.get(i))) {
				c += 1;
			}
			

		}
		System.out.println("Count is :" + c);

	}
}
