package arrays;

import java.util.Scanner;

public class PrintingDivisibleNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N value :");
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Enter The Index value :" + i + "," + j + ":");
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] % 3 == 0) {
					System.out.println(a[i][j] + " is Divisible by 3");
				} else {
					System.out.println(a[i][j] + " is  not Divisible by 3");
				}
			}
		}
	}
}
