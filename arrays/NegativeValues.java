package arrays;

import java.util.Scanner;

public class NegativeValues {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the value of N :");
		n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Value :");
			a[i] = sc.nextInt();
		}
		System.out.println("Negative Nuber is :");
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				System.out.println(a[i]);
			}
		}
	}
}
