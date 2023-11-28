package collection;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class LinkedhasmapinCollection {
	public static void main(String[] args) {
		int n, key;
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N value :");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The Key :");
			key = sc.nextInt();
			System.out.println("Enter The Value :");
			String value = sc.next();
			lhm.put(key, value);
		}
		for (Integer key1 : lhm.keySet()) {
			System.out.println(key1 + " " + lhm.get(key1));
		}
	}
}
