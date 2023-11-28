package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SmallValuePosition {
	public static void main(String[] args) {
		int n, m, x = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value :");
		n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the value :");
			a[i] = sc.nextInt();
		}
		System.out.println("Array is :");
		System.out.println(Arrays.toString(a));
		m = a[0];
		for (int i = 0; i < n; i++) {
			if (m > a[i]) {
				m = a[i];
				x = i;
			}
		}
		System.out.println("Smallest Value Position is :" + x);
	}
}
