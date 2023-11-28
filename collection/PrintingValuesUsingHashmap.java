package collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintingValuesUsingHashmap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		System.out.println("Enter The n value :");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The Key :");
			int key = sc.nextInt();
			System.out.println("Enter The Value :");
			String val = sc.next();
			lhm.put(key, val);
		}
		System.out.println("Result is :" + lhm);
		// for each loop
		for (Map.Entry<Integer, String>mapElement : lhm.entrySet()) {
			Integer key2 = mapElement.getKey();//getting keys
			String value = mapElement.getValue();//getting values
			System.out.println(key2 + ":" + value); //printing got keys and values
		}
	}
}
