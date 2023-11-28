package collection;

import java.util.HashMap;
import java.util.Scanner;

public class FindingParticularValueinHashmap {
	public static void main(String[] args) {
		int x, t, key;
		HashMap<Integer, String> hm = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value :");
		x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.println("Enter The Key :");
			key = sc.nextInt();
			System.out.println("Enter The value :");
			String val = sc.next();
			hm.put(key, val);
		}
		System.out.println("Enter The Particular key value :");
		int n = sc.nextInt();
		for (Integer key1 : hm.keySet()) {  //keyset only getting keys only

			if (key1 == n) {
				System.out.println(hm.get(key1) + " Available"); //get only gettin values
				System.exit(0);

			}
		}
	}
}
