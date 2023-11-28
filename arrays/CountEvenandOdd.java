package arrays;

import java.util.Scanner;

public class CountEvenandOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N values :");
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		int ec = 0, oc = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Enter Index Value :" + i + "," + j + " :");
				a[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] % 2 == 0) {
					ec += 1;
				} else {
					oc += 1;
				}
			}
		}
		System.out.println("Even Count is :" + ec);
		System.out.println("Odd Count is :" + oc);
	}
}
