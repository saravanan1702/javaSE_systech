package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyRangeofMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array size :");
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for (int i = 0; i < n; i++) {

			a[i] = sc.nextInt();
		}
		b = Arrays.copyOfRange(a, 1, 3);
		System.out.println("Current Array is :" + Arrays.toString(a));
		System.out.println("Copy Array is :" + Arrays.toString(b));

	}
}
