package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintStringArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter The n value ");
		n = sc.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Enter The Index values :");
				a[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Printing String Array :");
		System.out.print(Arrays.deepToString(a));
	}
}
