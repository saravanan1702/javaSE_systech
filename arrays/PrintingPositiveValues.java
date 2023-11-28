package arrays;

import java.util.Scanner;

public class PrintingPositiveValues {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum = 0;
		int count = 0;
		System.out.println("Enter the Nuber :");
		n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter The Value a[" + i + "] :");
			a[i] = sc.nextInt();
		}
		System.out.println("positive Number is :");
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				System.out.print(a[i] + " ");

				sum += a[i];

				count++;

			}
			System.out.println();

		}
		System.out.println("sum of positve number :" + sum);
		System.out.println("count of positve number :" + count);

	}
}
