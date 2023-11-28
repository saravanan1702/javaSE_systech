package arrays;

import java.util.Scanner;

public class SmallestElementInrow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The size of Array :");
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Enter Index value :");
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println("Smallest element in row");
		for (int i = 0; i < n; i++) {
			int x = a[i][0];
			for (int j = 0; j < n; j++) {
				if (x > a[i][j]) {
					x = a[i][j];
				}
			}
			System.out.println("Smallest Element in row :" + x);
		}
	}
}
