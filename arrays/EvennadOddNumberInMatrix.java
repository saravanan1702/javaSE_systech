package arrays;

import java.util.Scanner;

public class EvennadOddNumberInMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value :");
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Enter The Index value :" + i + "," + j + " :");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] % 2 == 0) {
					System.out.println(a[i][j] + " is Even");
				} else {
					System.out.println(a[i][j] + " is Odd");
				}
			}
		}
	}
}
