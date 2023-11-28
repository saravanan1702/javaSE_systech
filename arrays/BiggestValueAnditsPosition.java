package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BiggestValueAnditsPosition {
	public static void main(String[] args) {
		int n, m, x = 0;// set default position x is oth position is biggest value and its position
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of N :");
		n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The Value of Index =>" + i + " :");
			a[i] = sc.nextInt();

		}
		System.out.println("Array is :");
		System.out.println(Arrays.toString(a));
		m = a[0];
		for (int i = 1; i < n; i++) {
			if (m < a[i]) {
				m = a[i]; // value
				x = i;// i position
			}
		}
		System.out.println("Biggest Value of the Array  :" + m);
		System.out.println("Biggest Value Position is :" + x);
	}
}
