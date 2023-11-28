package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArrayUsingStringFormat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the n value :");
		n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The value :");
			a[i] = sc.nextInt();

		}
		int b[] = a;
		System.out.println("Current Array is:" + Arrays.toString(a));
		System.out.println("Copy Array is   :" + Arrays.toString(b));

	}
}
