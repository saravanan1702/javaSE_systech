package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter Value :");
		n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The value :");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i] + " is Even Number ");
			} else {
				System.out.println(a[i] + " is Odd Number ");

			}

		}

	}
}
