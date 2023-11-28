package arrays;

import java.util.Scanner;

public class Dublicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the n value :");
		n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the value of a[" + i + "] :");
			a[i] = sc.nextInt();

		}
		System.out.println("Result is :");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("Dublicate is :" + a[i]);
				}
			}
		}

	}
}
