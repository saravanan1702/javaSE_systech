package collection;

import java.util.HashMap;
import java.util.Scanner;

public class RemovingParticularValueinHashMap {
	public static void main(String[] args) {
		int n, key;
		HashMap<Integer, String> a = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The Key :");
			key = sc.nextInt();
			System.out.println("Enter the value :");
			String val = sc.next();
			// getting key and value pair together
			a.put(key, val);

		}
		System.out.println("Result is :" + a);
		System.out.println("Enter The Particular Key value :");
		int remove = sc.nextInt();// this value if there anything it will remove

		// just testing conditon based task on my own
//		if (a.keySet().contains(remove)) {
//			a.remove(remove);
//			System.out.println("Updated Result is :" + a);
//
//		}
//		else {
//			System.out.println("Values not Available");
//		}
		a.remove(remove);
		System.out.println("Updated Result is :" + a);

	}
}
