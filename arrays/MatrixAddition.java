package arrays;

import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The n Value :");
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Enter Index value :" + i + "," + j + " :");
				a[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println("Enter The x Value :");
		int x = sc.nextInt();
		int b[][] = new int[x][x];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Enter Index value :" + i + "," + j + ":");
				b[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		int c[][] = new int[x][x];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j] += a[i][j] + b[i][j];
			}
		}
		System.out.println("Addition of 2 Matrices :");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(c[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
	}
}
