package arrays;

import java.util.Scanner;

public class BiggestValueInRow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array :");
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Enter The Index value :" + i + "," + j + ":");
				a[i][j] = sc.nextInt();

			}

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println("The Biggest value in row :");
		for (int i = 0; i < n; i++) {
			int x = a[i][0];
			for (int j = 0; j < n; j++) {
				if (x < a[i][j]) {
					x = a[i][j];
				}
			}

			System.out.print(x);
			System.out.print("\t");
		}
	}
}
