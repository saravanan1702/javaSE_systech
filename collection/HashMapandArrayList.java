package collection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapandArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> hm = new HashMap<>();
		int n, key;
		String val;
		System.out.println("Enter The size of HashMap :");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter The Key " +i+" :");
			key = sc.nextInt();
			System.out.print("Enter the value :");
			val = sc.next();
			hm.put(key, val);

		}
		System.out.println("Result is :" + hm);

	}
}
