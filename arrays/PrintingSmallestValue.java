package arrays;

import java.util.Scanner;

public class PrintingSmallestValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Index value of :" + i + "," + j + ":");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Array of Index :");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		int x = a[0][0];
		int row = 0;
		int col = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (x > a[i][j]) {
					x = a[i][j];
					row = i;
					col = j;
				}
			}
		}
		System.out.println("Smallest Element in this matrix is :" + x);
		System.out.println("Smallest element row is " + row + " column" + " is " + col);
	}
}
