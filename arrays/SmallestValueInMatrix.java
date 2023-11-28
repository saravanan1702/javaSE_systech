package arrays;

import java.util.Scanner;

public class SmallestValueInMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of Array :");
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Enter the Index value :" + i + "," + j + ":");
				a[i][j] = sc.nextInt();
			}
		}
		int x = a[0][0];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (x > a[i][j]) {
					x = a[i][j];
				}
			}
		}
		System.out.println("Smallest Element is :" + x);
	}
}
