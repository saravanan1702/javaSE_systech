package methods;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayValuesStoreInJava {
	static void store() {
		int n, t;
		ArrayList<Integer> a = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N :");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			t = sc.nextInt();
			a.add(t);
		}
		System.out.println("ArrayList :"+a);
	}
	
	public static void main(String[] args) {
		store();
		store();
	}
}
