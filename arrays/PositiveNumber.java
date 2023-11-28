package arrays;

import java.util.Scanner;

public class PositiveNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Value :");
			a[i] = sc.nextInt();
		}
		System.out.println("positive Number is:");
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				System.out.print(a[i] + " ");
			}
		}

	}
}
