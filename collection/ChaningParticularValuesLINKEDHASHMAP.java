package collection;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class ChaningParticularValuesLINKEDHASHMAP {
	public static void main(String[] args) {
		int n, key;
		Scanner sc = new Scanner(System.in);
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		System.out.println("Enter The n value :");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The key :");
			key = sc.nextInt();
			System.out.println("Enter The value :");
			String val = sc.next();
			lhm.put(key, val);

		}
		System.out.println("Result is :"+lhm);
		System.out.println("Enter The Particular key Value :");
		int x=sc.nextInt();
	    lhm.remove(x);//giving key to delete particular value 
	    System.out.println("Updated Result is :"+lhm);
	}
}