package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArrayMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the N value :");
		n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the Index value :");
			a[i] = sc.nextInt();
		}
		System.arraycopy(a, 0, b, 0, a.length);
		System.out.println("Current Array :" + Arrays.toString(a));
		System.out.println("Copy Array    :" + Arrays.toString(b));

	}
}
