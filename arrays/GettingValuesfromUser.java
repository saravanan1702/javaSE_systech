package arrays;

import java.util.Scanner;

public class GettingValuesfromUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a[] = new int[5];
		System.out.println("Enter The N number :");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter Value of a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		System.out.println("Result is :");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}
}
