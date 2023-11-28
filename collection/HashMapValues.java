package collection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapValues {
	public static void main(String[] args) {
		int key;
		String val;
		HashMap<Integer, String> hm = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of hashmap :");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter The ID " + i + " :");
			key = sc.nextInt();
			System.out.println("Enter The value :");
			val = sc.next();
			hm.put(key, val);// getting keys and val in hashmap.;k
		}
		for (Integer key1 : hm.keySet()) {
			System.out.print("keys :" + key1);
			System.out.print("\n");
			System.out.print("values :" + hm.get(key1));
			System.out.println();
		}

	}
}
