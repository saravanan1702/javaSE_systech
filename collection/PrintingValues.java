package collection;

import java.util.HashMap;
import java.util.Scanner;

public class PrintingValues {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> a = new HashMap<>();
		System.out.println("Enter The Number :");
		int n = sc.nextInt();
		int key;
		String val;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The key :");
			key = sc.nextInt();
			System.out.println("Enter The Value :");
			val = sc.next();
			a.put(key, val);
		}
		System.out.println("Result is :" + a);

	}
}
