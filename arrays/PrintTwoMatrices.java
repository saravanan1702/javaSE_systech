package arrays;

import java.util.Scanner;

public class PrintTwoMatrices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N value :");
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Enter The Index value :" + i + "," + j + ":");
				a[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Enter X value :");
		int x = sc.nextInt();
		int b[][] = new int[x][x];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Enter The Index value :" + i + "," + j + ":");
				b[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println("\n");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(b[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}

	}
}
