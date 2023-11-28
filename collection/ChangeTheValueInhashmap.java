package collection;

import java.util.HashMap;
import java.util.Scanner;

public class ChangeTheValueInhashmap {
	public static void main(String[] args) {
		int n, key;
		HashMap<Integer, String> a = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N :");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The key :");
			key = sc.nextInt();
			System.out.println("Enter The value :");
			String val = sc.next();
			a.put(key, val); // import key and value pair in hashmap

		}
		System.out.println("Resulut is :");
		System.out.println("Enter the Particular value  :");
		int Keychange = sc.nextInt();
		System.out.println("Enter The change value that you want to change :");
		String valchange = sc.next();
		a.put(Keychange, valchange);
		System.out.println("Updated Result is :" + a);

	}
}
