package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value :");
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Enter The Index value :" + i + "," + j + ":");
				a[i][j] = sc.nextInt();
			}
		}
		int b[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				b[i][j] = a[i][j];
			}
		}
		System.out.println("Current Matrix is :" + Arrays.deepToString(a));
		System.out.println("Copy Matrix is :" + Arrays.deepToString(b));
	}
}
