package array_execersice;

import java.util.Scanner;

public class AddTwoMatrixes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Index Size :");
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Index value :" + i + "," + j + ":");
				a[i][j] = sc.nextInt();
			}
		}
		int b[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Index value :" + i + "," + j + ": ");
				b[i][j] = sc.nextInt();
			}
		}
		int c[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("Addition of Two Matrix :");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(c[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
