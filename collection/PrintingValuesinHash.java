package collection;

import java.util.HashMap;
import java.util.Scanner;

public class PrintingValuesinHash {
	public static void main(String[] args) {
		int n_times, keys;
		HashMap<Integer, String> a = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number of time you want to print hashmap values :");
		n_times = sc.nextInt();
		for (int i = 0; i < n_times; i++) {
			System.out.println("Enter The Key of Hashmap :");
			keys = sc.nextInt();
			System.out.println("Enter The value of HashMap :");
			String val = sc.next();
			// getting inputes hashmap pair(keys and values)
			a.put(keys, val);

		}
		System.out.println("Result is :" + a);
		for (Integer x : a.keySet()) {
			System.out.println(a.get(x));// get using for getting only values
		}
	}
}
