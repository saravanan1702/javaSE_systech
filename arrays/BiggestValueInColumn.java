package arrays;

import java.util.Scanner;

public class BiggestValueInColumn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The size of Array :");
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Enter The Index values :" + i + "," + j + ":");
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
		System.out.println("Biggest Value in Column:");
		for (int i = 0; i < n; i++) {
			int x = a[0][0];
			for (int j = 0; j < n; j++) {
				if (x < a[j][i]) {
					x = a[i][j];
				}
			}
			System.out.print(x);
			System.out.print("\t");
		}
	}
}
