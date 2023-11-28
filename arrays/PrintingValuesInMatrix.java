package arrays;

import java.util.Scanner;

public class PrintingValuesInMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter The N value :");
		n = sc.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Enter The Index Value :=> " + i + "," + j + ": ");
				a[i][j] = sc.nextInt();
			}

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
