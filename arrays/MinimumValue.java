package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumValue {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter The value :");
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the value :");
			a[i] = sc.nextInt();
		}
		System.out.println("Array is :");
		System.out.println(Arrays.toString(a));
		int m = a[0];
		for (int i = 0; i < a.length; i++) {
			if (m > a[i]) {
				m = a[i];
			}
		}
		System.out.println("Minimum Value is :" + m);

	}
}
