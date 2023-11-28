package arrays;

import java.util.Scanner;

public class MatrixSubstraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the N value :");
		n = sc.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Enter The values :");
				a[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		int x;
		System.out.println("Enter the x value :");
		x = sc.nextInt();
		int b[][] = new int[x][x];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Enter the values :");
				b[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		int c[][] = new int[x][x];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j] = a[i][j] - b[i][j];
			}

		}
		System.out.println("Substraction of 2 matrices:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(c[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
