package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyMatrixusingSystemMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size :");
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Enter The Index value " + i + "," + j + ":");
				a[i][j] = sc.nextInt();
			}
		}
		int x[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			System.arraycopy(a, 0, x, 0, a.length);
		}
		System.out.println("Copy of Array :");
		System.out.println(Arrays.deepToString(x));
	}
}
