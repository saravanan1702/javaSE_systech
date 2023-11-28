package arrays;

import java.util.Scanner;

public class PrintingIndexofBiggesValues {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of Array :");
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Enter The Index Value :" + i + "," + j + ":");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("The Array is :");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
				System.out.print("\t");
			}
			System.out.println();
		}
		int x = a[0][0];
//		get row and columns index Number
		int row = 0;
		int col = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (x < a[i][j]) {
					x = a[i][j];
					row = i;
					col = j;
				}
			}

		}
		System.out.println("Biggest element in the Matrix Array is :" + x);
		System.out.println("Biggest Element Row is :" + row + " Column is " + col);

	}
}
